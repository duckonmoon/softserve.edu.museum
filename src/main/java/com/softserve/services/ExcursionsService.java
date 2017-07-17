package com.softserve.services;

import com.softserve.entity.Excursions;
import dto.ExcursionsDTO;

import java.util.List;

/**
 *
 */
public interface ExcursionsService {
    List<Excursions> getAllExcursions();

    void add(Excursions entity);
    void update(Excursions entity);
    Excursions getExcursionById(Long id);
    void delete(Excursions entity);

    List<ExcursionsDTO> getAllExcursionsWithGuides();
}
