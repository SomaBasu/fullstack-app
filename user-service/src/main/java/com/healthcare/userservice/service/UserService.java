package com.healthcare.userservice.service;

import java.util.List;

import com.healthcare.userservice.dto.UserDto;
import com.healthcare.userservice.entity.User;

public interface UserService {
	
	
	User registerUser(UserDto userDto);

	List<User> getAllUsers();

	User getUserById(int id);
}
