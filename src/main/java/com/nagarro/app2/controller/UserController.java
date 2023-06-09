package com.nagarro.app2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.app2.model.User;
import com.nagarro.app2.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userServiceObj;

	@Autowired
	private User userObj;

	@GetMapping("/login/{username}")
	public User getAllUser(@PathVariable String username) {
		return userServiceObj.findUser(username);
	}

}
