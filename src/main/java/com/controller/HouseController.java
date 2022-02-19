package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public List<HouseBean> getAllHouses() {

		List<HouseBean> houses = houseDao.getAllHouses();
		return houses;
	}

	@DeleteMapping("/houses/{houseId}")
	public List<HouseBean> deleteHouse(@PathVariable("houseId") int houseId) {
		houseDao.deleteHouse(houseId);
		return houseDao.getAllHouses();
	}

	@PutMapping("/houses")
	public HouseBean updateHouse(HouseBean house) {
		// title
		// id
		houseDao.updateHouse(house);
		return house;
	}

}
