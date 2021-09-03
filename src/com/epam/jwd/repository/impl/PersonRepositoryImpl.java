package com.epam.jwd.repository.impl;

import com.epam.jwd.repository.api.PersonRepository;
import com.epam.jwd.repository.exception.RepositoryException;
import com.epam.jwd.repository.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {
    private static String NULL_ID_EXCEPTION = "The id is null";
    private final List<Person> storage = new ArrayList<>();

    @Override
    public Person findByName(String name) {
        return storage.stream()
                .filter(person -> name.equals(person.getName()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Person entity) {
        storage.add(entity);
    }

    @Override
    public Person findById(Long id) throws RepositoryException {
        if (id == null){
            throw new RepositoryException(NULL_ID_EXCEPTION);
        }
        return storage.stream()
                .filter(person -> id.equals(person.getId()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Person> findAll() {
        return storage;
    }
}
