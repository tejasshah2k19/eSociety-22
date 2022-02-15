package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.HouseBean;

@Repository
public class HouseDao {

	@Autowired
	JdbcTemplate stmt; 
	
	
	public void addHouse(HouseBean house) {
		stmt.update("insert into house (title) values (?) ",house.getTitle());
	}
	public List<HouseBean> getAllHouses() {
		return stmt.query("select * from house", new BeanPropertyRowMapper<HouseBean>(HouseBean.class));
	}
}
