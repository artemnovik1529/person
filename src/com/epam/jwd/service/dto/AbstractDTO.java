package com.epam.jwd.service.dto;

public abstract class AbstractDTO<T> {
     protected T id;

    public AbstractDTO(T id) {
        this.id = id;
    }

    public AbstractDTO() {
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
