package com.softserve.dao;

import com.softserve.entity.Users;

/**
 * Created by Shmidt on 26.07.2017.
 */
public interface UsersDao extends BaseDao<Users> {

    public Users getByEmail(String email);
}
