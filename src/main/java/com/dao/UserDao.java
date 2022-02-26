package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate stmt;

	public void addUser(UserBean user) {
		stmt.update("insert into users (firstname,email,password,roleid,lastname,houseid,mobileno) values (?,?,?,?,?,?,?)",
				user.getFirstName(), user.getEmail(), user.getPassword(), user.getRoleId(), user.getLastName(),
				user.getHouseId(), user.getMobileNo());
	}

	public List<UserBean> getAllUsers(){
		return stmt.query("select users.*,role.rolename from users,role where users.roleid = role.roleid ", new BeanPropertyRowMapper<UserBean>(UserBean.class));
	}

}
