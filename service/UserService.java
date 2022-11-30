package com.attrecto.academy.java.courseapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.attrecto.academy.java.courseapp.model.dto.MinimalUserDto;

public class UserService {

	private UserRepository userRepository;

	public User findUserById(Integer id) {
		Optional<User> user = userRepository.findById(id);
		if(user.isEmpty()) {
			throw new NotFoundException(String.format("User cannot be found with id: %s", id));
		}
		return user.get();
	}
}
