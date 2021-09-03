package com.epam.jwd.controller;

import com.epam.jwd.service.api.Service;
import com.epam.jwd.service.dto.PersonDTO;
import com.epam.jwd.service.exception.ServiceException;
import com.epam.jwd.service.impl.PersonServiceImpl;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) throws ServiceException {
        Service<Long, PersonDTO> service = new PersonServiceImpl();

        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(1L);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        personDTO.setName(scanner.next());

        System.out.println("Please enter your surname");
        personDTO.setSurname(scanner.next());

        System.out.println("Please enter your age");
        personDTO.setAge(scanner.nextInt());

        System.out.println("Please enter your gender");
        personDTO.setGender(scanner.next());

        System.out.println("Are you married??");
        personDTO.setMarried(scanner.nextBoolean());

        service.save(personDTO);

        System.out.println(service.getById(1L));

    }
}
