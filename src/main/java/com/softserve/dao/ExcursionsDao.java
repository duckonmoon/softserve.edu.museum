package com.softserve.dao;

import com.softserve.entity.Excursions;
import dto.ExcursionsDTO;

import java.util.List;

/**
 *
 */
public interface ExcursionsDao extends BaseDao<Excursions, Long> {
    List<ExcursionsDTO> getAllExcursionsWithGuides();

    List<Excursions> getExcursionsByStartEnd(String start,String end);
}
