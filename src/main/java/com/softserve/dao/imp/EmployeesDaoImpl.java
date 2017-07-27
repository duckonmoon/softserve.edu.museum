package com.softserve.dao.imp;

import com.softserve.dao.EmployeesDao;
import com.softserve.entity.Employees;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
public class EmployeesDaoImpl extends BaseDaoImpl<Employees> implements EmployeesDao {

    public List<Employees> everything() {
        return entityManager.createNamedQuery("Task05").getResultList();
    }
}
