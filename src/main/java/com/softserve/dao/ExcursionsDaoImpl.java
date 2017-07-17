package com.softserve.dao;

import com.softserve.entity.Excursions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
public class ExcursionsDaoImpl extends BaseDaoImpl<Excursions, Long> implements ExcursionsDao {

//    public List<Excursions> getAllEntities() {
//        return entityManager.createQuery("from " ).getResultList();
//    }

    public List<?> doSmth()
    {
        return entityManager.createQuery("from Excursions as excursion inner join excursion.guide as guide").getResultList();
    }
}
