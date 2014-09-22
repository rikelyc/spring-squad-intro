package be.c4j.springsquad.domain;

/**
 * Created by christophe on 22.09.14.
 */
public class Person {
    private Long id;
    private String name;
    private String firstname;

    public Person(Long id, String name, String firstname) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }
}
