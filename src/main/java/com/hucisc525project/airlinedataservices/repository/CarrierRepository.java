package com.hucisc525project.airlinedataservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hucisc525project.airlinedataservices.model.Carrier;
/**
 * @author Anil Bashetty
 *
 * 
 */
@Repository
public interface CarrierRepository extends MongoRepository<Carrier, String> {

	@Query("{code:'?0'}")
	Carrier findByCode(@Param("code") String code);
}
