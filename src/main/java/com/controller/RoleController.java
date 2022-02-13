package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.RoleBean;
import com.dao.RoleDao;

@RestController
public class RoleController {

	@Autowired
	RoleDao roleDao;
	
	
	@PostMapping("/roles")
	public RoleBean addRole(RoleBean role) {
		
		roleDao.addRole(role);
		return role;
	}
	
}
