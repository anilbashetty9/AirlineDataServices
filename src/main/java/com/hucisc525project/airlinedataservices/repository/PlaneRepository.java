package com.hucisc525project.airlinedataservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hucisc525project.airlinedataservices.model.Plane;

@Repository
public interface PlaneRepository extends MongoRepository<Plane, String> {

	@Query("{tailnum:'?0'}")
	Plane findByTailnum(@Param("tailnum") String tailnum);

}
