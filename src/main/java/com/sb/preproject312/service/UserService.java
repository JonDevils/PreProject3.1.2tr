package com.sb.preproject312.service;


import com.sb.preproject312.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void save(User user);
    void delete(User user);
    User getById(int id);
    void updateUser(User user);
}