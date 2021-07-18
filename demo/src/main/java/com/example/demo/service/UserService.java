package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.jpa.UserRepository;
import com.example.demo.model.Login;
import com.example.demo.model.User;

@Component
public class UserService {
	@Autowired
	public UserRepository userRepo;

	public void addUser(User user) {
		userRepo.save(user);
	}

	public User validateUser(Login login) {
		return userRepo.findById(login.getUsername());
	}
}
