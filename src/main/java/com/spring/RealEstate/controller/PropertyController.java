package com.spring.RealEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.RealEstate.Repository.RatingRepository;
import com.spring.RealEstate.Service.PropertyService;
import com.spring.RealEstate.Service.RatingService;
import com.spring.RealEstate.model.Property;
import com.spring.RealEstate.model.Rating;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/all")
public class PropertyController {
	
	@Autowired
	private PropertyService propertyService;
	
	@Autowired
	private RatingService ratingService;	
	

	@CrossOrigin(origins = "*")
	@PostMapping("/prop")
	public Property saveProperties(@RequestBody Property property) {
		return propertyService.saveProperties(property);
		
	}
	
	@PostMapping("/location")
	public List<Property> getAllProperties(@RequestBody String location) {
		//log.info(" inside get all products method in ProductServices");
		return propertyService.getAllProperties(location);
	}
	
	@PostMapping("/save/{id}")
	public Rating saveRating(@PathVariable("id") Long id, @RequestBody Rating rating) {
		return ratingService.saveRating(id, rating);
	}

}

