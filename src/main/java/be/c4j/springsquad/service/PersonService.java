package be.c4j.springsquad.service;

import be.c4j.springsquad.dao.PersonDao;
import be.c4j.springsquad.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by christophe on 22.09.14.
 */
@Service
public class PersonService {

    private final PersonDao dao;

    @Autowired
    public PersonService(PersonDao dao) {
        this.dao = dao;
    }

    public List<Person> getAll() {
        return dao.getAll();
    }
}
