package com.softserve.dao;

import com.softserve.entity.Employees;

import java.util.List;

/**
 * Created by shmidt on 16.07.17.
 */
public interface EmployeesDao extends BaseDao<Employees> {
    List<Employees> everything();

}
