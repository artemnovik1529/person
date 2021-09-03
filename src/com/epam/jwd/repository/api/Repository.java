package com.epam.jwd.repository.api;

import com.epam.jwd.repository.exception.RepositoryException;
import com.epam.jwd.repository.model.Entity;

import java.util.List;

public interface Repository<V,T extends Entity<V>> {
    void save (T entity);
    T findById(V id) throws RepositoryException;
    List<T> findAll();

}
