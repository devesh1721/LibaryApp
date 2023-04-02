package com.nagarro.app2.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.app2.model.User;

@Repository
public interface UserDao extends JpaRepository<User, String> {
	public User findByUsername(String username);
}
