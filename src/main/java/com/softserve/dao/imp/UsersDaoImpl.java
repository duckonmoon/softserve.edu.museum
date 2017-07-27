package com.softserve.dao.imp;

import com.softserve.dao.UsersDao;
import com.softserve.entity.Users;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Shmidt on 26.07.2017.
 */
@Transactional
@Repository
public class UsersDaoImpl extends BaseDaoImpl<Users> implements UsersDao {

    private Class<Users> entityClass;

    public Users getByEmail(String email) {
        return entityManager.find(entityClass, email);
    }
}
