package com.nagarro.app2.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.app2.model.User;
import com.nagarro.app2.repo.UserDao;
import com.nagarro.app2.service.UserService;


@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserDao userDaoObj;

	@Autowired
	private User user;

	@SuppressWarnings("deprecation")
	@Override
	public User findUser(String username) {
		return userDaoObj.findByUsername(username);
	}

}
