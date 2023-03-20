package com.sb.preproject312.dao;

import com.sb.preproject312.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer > {
}
