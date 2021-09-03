package com.epam.jwd.repository.api;

import com.epam.jwd.repository.model.Person;

public interface PersonRepository extends Repository<Long, Person> {
    Person findByName(String name);

}
