package com.nagarro.app2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.app2.model.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Integer>{

}
