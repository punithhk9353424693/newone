package com.jspider.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.dto.User;
import com.jspider.repository.UserRepo;

@Service
public class UserServise {
@Autowired
UserRepo repo;
User user;
	public void persist(User user) {
		repo.saveUser(user);
	}
}
