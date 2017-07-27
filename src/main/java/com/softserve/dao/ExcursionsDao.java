package com.softserve.dao;

import com.softserve.dao.BaseDao;
import com.softserve.entity.Excursions;
import dto.ExcursionsDTO;

import java.util.List;

/**
 *
 */
public interface ExcursionsDao extends BaseDao<Excursions> {
    List<ExcursionsDTO> getAllExcursionsWithGuides();

    List<Excursions> getExcursionsByStartEnd(String start,String end);
}
