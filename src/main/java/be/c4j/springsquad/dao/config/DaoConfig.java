package be.c4j.springsquad.dao.config;

import be.c4j.springsquad.infrastructure.config.InMemoryDatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by christophe on 22.09.14.
 */
@Configuration
@Import(InMemoryDatabaseConfig.class)
@ComponentScan("be.c4j.springsquad.dao")
public class DaoConfig {
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
