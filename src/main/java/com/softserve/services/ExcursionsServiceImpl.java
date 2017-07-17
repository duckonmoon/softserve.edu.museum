package com.softserve.services;

import com.softserve.dao.ExcursionsDao;
import com.softserve.entity.Excursions;
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
        excursionsDao.add(entity);
    }

    public void update(Excursions entity) {
        excursionsDao.update(entity);
    }

    public Excursions getExcursionById(Long id) {
        return excursionsDao.getEntityById(id);
    }

    public void delete(Excursions entity) {
        excursionsDao.delete(entity);
    }
}
