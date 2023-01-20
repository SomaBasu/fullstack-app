package com.healthcare.userservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.userservice.dto.UserDto;
import com.healthcare.userservice.entity.User;
import com.healthcare.userservice.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User registerUser(UserDto userDto) {
		
		User user = new User();
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		user.setPhone(userDto.getPhone());
		user.setEmail(userDto.getEmail());
		user.setDob(userDto.getDob());
		user.setGender(userDto.getGender());
		user.setPincode(userDto.getPincode());
		user.setCity(userDto.getCity());
		user.setState(userDto.getState());
		user.setCountry(userDto.getCountry());
		return userRepo.save(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		return null;
	}

	@Override
	public User getUserById(int id) {
		
		return userRepo.findById(id).get();
	}

}
