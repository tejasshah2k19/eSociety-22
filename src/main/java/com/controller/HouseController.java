package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.HouseBean;
import com.dao.HouseDao;

@RestController
public class HouseController {

	@Autowired
	HouseDao houseDao;

	@PostMapping("/houses")
	public HouseBean addHouse(HouseBean house) {

		houseDao.addHouse(house);
		return house;
	}
	
	@GetMapping("/houses")
	public List<HouseBean> getAllHouses(){
		
		List<HouseBean> houses = houseDao.getAllHouses();
		return houses;
	}
	
	
	

}
