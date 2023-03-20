package com.sb.preproject312.service;

import com.sb.preproject312.dao.UserRepository;
import com.sb.preproject312.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    public void setUserDAO(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User getById(int id) {
        User user =null;
        Optional<User> emp = userRepository.findById(id);
        if (emp.isPresent()) {
            user=emp.get();
        }

        return user;
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }
}
