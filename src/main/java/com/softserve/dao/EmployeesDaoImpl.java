package com.softserve.dao;

import com.softserve.entity.Employees;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 *
 */
@Repository
public class EmployeesDaoImpl extends BaseDaoImpl<Employees, Long> implements EmployeesDao {

    public List<Employees> everything() {
        return entityManager.createNamedQuery("Task05").getResultList();
    }
}
