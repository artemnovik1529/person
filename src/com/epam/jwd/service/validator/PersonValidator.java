package com.epam.jwd.service.validator;

import com.epam.jwd.service.dto.PersonDTO;
import com.epam.jwd.service.exception.ServiceException;

public class PersonValidator {
    private static final int MIN_NAME_LENGTH = 1;
    // закидываем в проперти переменные
    // все поля делаем if
    private static String INVALID_NAME_EXCEPTION = "The name is invalid (the length of the name should be more than 1 chars";
    private static String NULL_NAME_EXCEPTION = "The name can not be null";
    private static String NULL_AGE_EXCEPTION = "The age should be positive";
     public void validate(PersonDTO dto) throws ServiceException {
        validateName(dto.getName());
        validateAge(dto.getAge());

    }
    private void validateName(String name) throws ServiceException {
        if(name == null){
            // Логгер
            throw new ServiceException(NULL_NAME_EXCEPTION);
        }
        if (name.length() <= MIN_NAME_LENGTH) {
                throw new ServiceException(INVALID_NAME_EXCEPTION);
        }
    }
    private void validateAge(int age) throws ServiceException{
        if (age <= 0) {
            throw new ServiceException(NULL_AGE_EXCEPTION);
        }
    }
}