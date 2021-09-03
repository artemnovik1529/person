package com.epam.jwd.service.api;

import com.epam.jwd.service.dto.AbstractDTO;
import com.epam.jwd.service.exception.ServiceException;

import java.util.List;

public interface Service<V, T extends AbstractDTO<V>> {
    void save(T dto) throws ServiceException;
    T getById(V id) throws ServiceException;
    List<T> getAll();
}
