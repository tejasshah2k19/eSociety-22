package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.HouseBean;
import com.bean.RoleBean;

@Repository
public class RoleDao {

	@Autowired
	JdbcTemplate stmt;

	public void addRole(RoleBean role) {
		stmt.update("insert into role (rolename) values (?) ", role.getRoleName());
	}

	
}
