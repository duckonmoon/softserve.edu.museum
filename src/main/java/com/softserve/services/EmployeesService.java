package com.softserve.services;

import com.softserve.entity.Employees;

import java.util.List;

/**
 *
 */
public interface EmployeesService {
    List<Employees> getAllEmployees();

    void add(Employees entity);
    void update(Employees entity);
    Employees getEmployeeById(Long id);
    void delete(Employees entity);

    List<Employees> everything();
}
