package com.spring.RealEstate.Service;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.annotations.Check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.RealEstate.Repository.PropertyRepository;
import com.spring.RealEstate.exception.RealEstateException;
import com.spring.RealEstate.model.Property;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.LoggerFactory;

import org.slf4j.LoggerFactory;

@Slf4j
@Service
public class PropertyService {
	
	@Autowired
	private PropertyRepository propertyRepository;
	
	public Property saveProperties(Property property) {
		return propertyRepository.save(property);
		
	}
	
	public List<Property> getAllProperties(String location) {
		try {
			log.info("Getting all properties based on location:"+location);
			return propertyRepository.getAllProperties(location);
		}
		catch(IllegalArgumentException e) {
			throw new RealEstateException("403","please Check your location"+e.getMessage());
		}
		}
		
	

	public List<Property> getProperties() {
		try {
			log.info("Display all properties that are available:");
			return propertyRepository.findAll();
		}
		catch(IllegalArgumentException e) {
			throw new RealEstateException("403","No properties are available"+e.getMessage());
		}
		
	}
	
	
	 public Property getProperty(@PathVariable("id") Long id)
	    {
		 try {
			 log.info("Getting all properties based on id:"+id);
			 return propertyRepository.getById(id);
		 }
		 catch(ObjectNotFoundException e ) {
				throw new RealEstateException("404","Id not found"+e.getMessage());
			}
	    	
	    }

	public String deleteAProduct(Long id) {
		log.info(" inside deleteAProperty method in PropertyServices");
		propertyRepository.deleteById(id);
		return "Delete Successfully";
		
	}

}
