package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.UserBean;
import com.dao.UserDao;

@RestController
public class UserController {

	@Autowired
	UserDao userDao;

	@PostMapping("/users")
	public UserBean saveUser(UserBean user) {
		userDao.addUser(user);
		return user;
	}
}
