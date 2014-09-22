package be.c4j.springsquad.dao;

import be.c4j.springsquad.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by christophe on 22.09.14.
 */
@Repository
public class PersonDao {

    public static final String SQL = "select id, firstname, lastname from person";
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Person> getAll() {
        List<Person> list = jdbcTemplate.query(
                SQL,
                (resultSet, i) ->
                        new Person(
                                resultSet.getLong(1),
                                resultSet.getString(2),
                                resultSet.getString(3)
                        )
                );
        return list;
    }
}
