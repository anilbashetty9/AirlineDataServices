package com.hucisc525project.airlinedataservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hucisc525project.airlinedataservices.model.Carrier;
import com.hucisc525project.airlinedataservices.repository.CarrierRepositoryImpl;

@RestController
//@RequestMapping("/carrier")
public class CarrierController {	
	@Autowired
	CarrierRepositoryImpl repository;

	@RequestMapping(value = "/carrier", method = RequestMethod.GET)
	public Carrier findByCode(@Param("code") String code) {
		return repository.findByCode(code);
	}

}

