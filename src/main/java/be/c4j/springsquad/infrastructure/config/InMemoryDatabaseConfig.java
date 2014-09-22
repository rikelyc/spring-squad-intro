package be.c4j.springsquad.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by christophe on 22.09.14.
 */
@Configuration
@ImportResource("classpath:/context-infrastructure-in-memory.xml")
public class InMemoryDatabaseConfig {

}
