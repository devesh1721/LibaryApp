package com.nagarro.app2.service;

import java.util.List;
import java.util.Optional;

import com.nagarro.app2.model.User;

public interface UserService {

	public User findUser(String username);
}
