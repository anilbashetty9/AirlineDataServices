package com.hucisc525project.airlinedataservices.repository;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hucisc525project.airlinedataservices.model.Airport;

@Repository
public interface AirportRepository extends MongoRepository<Airport, String> {

	@Query("{iata:'?0'}")
	Airport findByIata(@Param("iata") String iata) throws IOException;
	
	@Query("{}")
	ArrayList<Airport> findByMostDepDelay();
	
	@Query("{}")
	ArrayList<Airport> findByLeastDepDelay();

}
