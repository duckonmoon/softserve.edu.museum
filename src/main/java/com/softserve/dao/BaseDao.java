package com.softserve.dao;

import java.util.List;

/**
 *
 */
public interface BaseDao<E, T> {

    void add(E entity);
    void update(E entity);
    E getEntityById(T id);
    List<E> getAllEntities();
    void delete(E entity);
}
