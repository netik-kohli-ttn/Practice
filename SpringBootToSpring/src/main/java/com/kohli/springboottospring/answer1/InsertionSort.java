package com.kohli.springboottospring.users;

import org.springframework.stereotype.Component;

@Component
public class User {
    Person person;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getPerson() {
        System.out.println(person.getName());
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
