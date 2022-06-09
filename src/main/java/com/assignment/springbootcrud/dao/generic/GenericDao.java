package com.assignment.springbootcrud.dao.generic;

import java.io.Serializable;

public interface GenericDao<T, ID extends Serializable> {

    Serializable add(final T entity);

    void update(final T entity);

    void delete(final T entity);

    void delete(final ID id);

    T get(final ID id);

}