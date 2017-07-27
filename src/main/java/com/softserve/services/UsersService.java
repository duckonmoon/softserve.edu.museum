package com.softserve.services;

import com.softserve.entity.Users;

import java.util.List;

/**
 * Created by Shmidt on 26.07.2017.
 */
public interface UsersService {

    void addUser(Users user);
    void updateUser(Users user);
    Users getUserById(Long userId);
    List<Users> getAllUsers();
    void deleteUser(Users user);
    Users findByEmail(String email);

}
