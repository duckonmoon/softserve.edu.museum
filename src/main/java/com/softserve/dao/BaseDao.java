package com.softserve.dao;

import java.util.List;

/**
 *
 */
public interface BaseDao<T> {

    void addEntity(T entity);
    void updateEntity(T entity);
    T getEntityById(Long id);
    List<T> getAllEntities();
    void delete(T entity);
}
