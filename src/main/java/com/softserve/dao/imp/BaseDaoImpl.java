package com.softserve.dao.imp;

import com.softserve.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 *
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    private Class<T> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

    @Autowired
    public BaseDaoImpl(){
        entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Transactional
    public void addEntity(T entity) {
        entityManager.persist(entity);
    }

    @Transactional
    public void updateEntity(T entity) {
        entityManager.merge(entity);
    }

    public T getEntityById(Long id) {
        return entityManager.find(entityClass, id);
    }

    public List<T> getAllEntities() {
        return entityManager.createQuery("from " + entityClass.getName()).getResultList();
    }

    @Transactional
    public void delete(T entity) {
        entityManager.remove(entity);
    }
}
