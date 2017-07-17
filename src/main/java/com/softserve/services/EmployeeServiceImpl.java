package com.softserve.services;

import com.softserve.dao.BaseDao;
import com.softserve.dao.EmployeesDao;
import com.softserve.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesDao employeesDao;

    public List<Employees> getAllEmployees() {
        return employeesDao.getAllEntities();
    }
}
