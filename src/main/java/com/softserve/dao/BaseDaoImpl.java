package com.softserve.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 *
 */
public class BaseDaoImpl<E, T> implements BaseDao<E, T> {

    private Class<E> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

    @Autowired
    public BaseDaoImpl(){
        entityClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Transactional
    public void add(E entity) {
        entityManager.persist(entity);
    }

    @Transactional
    public void update(E entity) {
        entityManager.merge(entity);
    }

    public E getEntityById(T id) {
        return (E)  entityManager.find(entityClass, id);
    }

    public List<E> getAllEntities() {
        return entityManager.createQuery("from " + entityClass.getName()).getResultList();
    }

    @Transactional
    public void delete(E entity) {
        entityManager.remove(entity);
    }
}
