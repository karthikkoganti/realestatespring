package com.spring.RealEstate.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.spring.RealEstate.model.Property;





public interface PropertyRepository extends JpaRepository<Property, Long> {
	@Query(value = "SELECT * FROM properties WHERE location = ?1", nativeQuery = true)
	List<Property> getAllProperties(String location);

}