package com.hucisc525project.airlinedataservices.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hucisc525project.airlinedataservices.model.Airport;
import com.hucisc525project.airlinedataservices.repository.AirportRepositoryImpl;
/**
 * @author Anil Bashetty
 *
 * 
 */
@RestController
public class AirportController {
	@Autowired
	AirportRepositoryImpl repository;

	@RequestMapping(value = "/airports", method = RequestMethod.GET)
	public Airport findByTailnum(@Param("iata") String iata) throws IOException {
		return repository.findByIata(iata);
	}
}
