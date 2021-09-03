package com.epam.jwd.service.impl;

import com.epam.jwd.repository.api.PersonRepository;
import com.epam.jwd.repository.exception.RepositoryException;
import com.epam.jwd.repository.impl.PersonRepositoryImpl;
import com.epam.jwd.service.api.PersonService;
import com.epam.jwd.service.converter.PersonConverter;
import com.epam.jwd.service.dto.PersonDTO;
import com.epam.jwd.service.exception.ServiceException;
import com.epam.jwd.service.validator.PersonValidator;

import java.util.List;
import java.util.stream.Collectors;

public class PersonServiceImpl implements PersonService {
    private final PersonRepository repository  = new PersonRepositoryImpl();
    private final PersonConverter converter = new PersonConverter();
    private final PersonValidator validator = new PersonValidator();
    @Override
    public PersonDTO getByName(String name) {
        return converter.convertPerson(repository.findByName(name));
    }

    @Override
    public void save(PersonDTO dto) throws ServiceException {
        validator.validate(dto);
        repository.save(converter.convertPerson(dto));

    }

    @Override
    public PersonDTO getById(Long id) throws ServiceException {
        try {
            return converter.convertPerson(repository.findById(id));
        } catch (RepositoryException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public List<PersonDTO> getAll() {
        return repository.findAll().stream()
                .map(converter::convertPerson)
                .collect(Collectors.toList());
    }
}
