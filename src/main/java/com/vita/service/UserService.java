package com.vita.service;
import org.springframework.http.ResponseEntity;

import com.vita.model.User;


public interface UserService {
	User createUser(User user);

	User getUserByEmail(String email);

	User getUserById(String userid);

	

}
