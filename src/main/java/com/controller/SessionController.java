package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class SessionController {

	@Autowired
	UserDao userDao;

	@GetMapping("/signup") // url
	public String signup() {
		System.out.println("signup......");
		return "Signup";// jsp name
	}

	@PostMapping("/saveuser")
	public String saveUser(UserBean user, Model model) {
		System.out.println(user.getFirstName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		model.addAttribute("user", user);
		userDao.addUser(user);
		return "Home";
	}
}
