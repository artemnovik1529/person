package com.epam.jwd.service.converter;

import com.epam.jwd.repository.model.Person;
import com.epam.jwd.service.dto.PersonDTO;

public final class PersonConverter {
    public Person convertPerson (PersonDTO personDTO){
        return new Person.Builder()
                .withId(personDTO.getId())
                .withName(personDTO.getName())
                .withAge(personDTO.getAge())
                .withHeight(personDTO.getHeight())
                .withDateOfBirth(personDTO.getDateOfBirth())
                .withSurname(personDTO.getSurname())
                .withMarried(personDTO.isMarried())
                .withGender(personDTO.getGender())
                .build();
    }

    public  PersonDTO convertPerson(Person person){
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName(person.getName());
        personDTO.setSurname(person.getSurname());
        personDTO.setHeight(person.getHeight());
        personDTO.setAge(person.getAge());
        personDTO.setDateOfBirth(person.getDateOfBirth());
        personDTO.setGender(person.getGender());
        personDTO.setShowDateOfBirth(person.isShowDateOfBirth());
        personDTO.setMarried(person.isMarried());

        return personDTO;

    }
}
