package com.softserve.dao;

import com.softserve.entity.Excursions;
import dto.ExcursionsDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
public class ExcursionsDaoImpl extends BaseDaoImpl<Excursions, Long> implements ExcursionsDao {

    public List<ExcursionsDTO> getAllExcursionsWithGuides() {
        return entityManager.createQuery("select g.lastname,g.firstname,e.start,e.end from Excursions e join" +
                " e.guide g where g.excursions=:guide ").getResultList();
    }
}
