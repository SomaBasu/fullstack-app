package com.healthcare.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.userservice.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
