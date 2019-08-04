package com.example.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.login.domain.User;

public interface UserRepositoty extends CrudRepository<User, Integer>{
	User findByEmail(String email);
}
