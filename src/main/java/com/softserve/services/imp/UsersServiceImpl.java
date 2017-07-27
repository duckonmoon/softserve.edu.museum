package com.softserve.services.imp;

import com.softserve.dao.UsersDao;
import com.softserve.entity.Users;
import com.softserve.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Shmidt on 26.07.2017.
 */
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDAO;

    @Autowired
    EntityManager entityManager;

    @Override
    public void addUser(Users user) {
        this.usersDAO.addEntity(user);
    }

    @Override
    public void updateUser(Users user) {
        this.usersDAO.updateEntity(user);
    }

    @Override
    public Users getUserById(Long userId) {
        return this.usersDAO.getEntityById(userId);
    }

    @Override
    public void deleteUser(Users user) {
        this.usersDAO.delete(user);
    }

    @Override
    public List<Users> getAllUsers() {
        return this.usersDAO.getAllEntities();
    }

    @Override
    public Users findByEmail(String email) {
        return this.usersDAO.getByEmail(email);
    }

}
