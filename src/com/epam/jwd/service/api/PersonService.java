package com.epam.jwd.service.api;

import com.epam.jwd.service.dto.PersonDTO;

public interface PersonService extends Service<Long, PersonDTO> {

    PersonDTO getByName(String name);

}
