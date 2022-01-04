package com.spring.RealEstate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.RealEstate.Repository.PropertyRepository;
import com.spring.RealEstate.model.Property;

@Service
public class PropertyService {
	
	@Autowired
	private PropertyRepository propertyRepository;
	
	public Property saveProperties(Property property) {
		return propertyRepository.save(property);
		
	}
	
	public List<Property> getAllProperties(String location) {
		//log.info(" inside get all products method in ProductServices");
		return propertyRepository.getAllProperties(location);
	}

	public List<Property> getProperties() {
		// TODO Auto-generated method stub
		return propertyRepository.findAll();
	}

}
