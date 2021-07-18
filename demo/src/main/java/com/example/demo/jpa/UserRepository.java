package com.example.demo.jpa;

import com.example.demo.model.User;

public interface UserRepository   {

	User save(User user);

	User findById(String username);

}
