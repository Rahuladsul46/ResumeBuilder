package com.te.resumebuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.te.resumebuilder.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	UserDetails findByUserName(String userName);

}
