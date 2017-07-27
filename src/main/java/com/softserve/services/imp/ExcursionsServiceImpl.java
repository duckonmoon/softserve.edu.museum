package com.softserve.services.imp;

import com.softserve.dao.ExcursionsDao;
import com.softserve.entity.Excursions;
import com.softserve.services.ExcursionsService;
import dto.ExcursionsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class ExcursionsServiceImpl implements ExcursionsService {

    @Autowired
    public ExcursionsDao excursionsDao;

    public List<Excursions> getAllExcursions() {
        return excursionsDao.getAllEntities();
    }

    public void add(Excursions entity) {
        excursionsDao.addEntity(entity);
    }

    public void update(Excursions entity) {
        excursionsDao.updateEntity(entity);
    }

    public Excursions getExcursionById(Long id) {
        return excursionsDao.getEntityById(id);
    }

    public void delete(Excursions entity) {
        excursionsDao.delete(entity);
    }

    public List<ExcursionsDTO> getAllExcursionsWithGuides() {
        return excursionsDao.getAllExcursionsWithGuides();
    }

    public List<Excursions> getExcursionsByStartEnd(String start, String end) {
        return excursionsDao.getExcursionsByStartEnd(start,end);
    }
}
