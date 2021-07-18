package com.example.demo.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.demo.model.User;

@Component
public class UserReopImp implements UserRepository {
	List<User> db;

	@PostConstruct
	public void initDB() {
		db = new ArrayList<>();

	}

	@Override
	public User save(User user) {
		db.add(user);
		return user;
	}

	@Override
	public User findById(String username) {
		return db.stream().filter(e -> e.getPassword().equals(username)).findFirst().get();
	}

}
