package com.example.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.login.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
	Role findByName(String name);
}
