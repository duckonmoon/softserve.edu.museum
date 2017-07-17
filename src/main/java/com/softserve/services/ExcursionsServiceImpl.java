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
}
