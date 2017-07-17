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

    public void add(Employees entity) {
        employeesDao.add(entity);
    }

    public void update(Employees entity) {
        employeesDao.update(entity);
    }

    public Employees getEmployeeById(Long id) {
        return employeesDao.getEntityById(id);
    }

    public void delete(Employees entity) {
        employeesDao.delete(entity);
    }


}
