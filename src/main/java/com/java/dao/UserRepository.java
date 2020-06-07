package com.java.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.dto.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
