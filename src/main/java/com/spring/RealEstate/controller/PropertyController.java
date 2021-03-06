package com.spring.RealEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@CrossOrigin(origins = "*")
	@GetMapping("/properties")
	public List<Property> getProperties(){
		return propertyService.getProperties();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/location")
	public List<Property> getAllProperties(@RequestBody String location) {
		//log.info(" inside get all products method in ProductServices");
		return propertyService.getAllProperties(location);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/save/{id}")
	public Rating saveRating(@PathVariable("id") Long id, @RequestBody Rating rating) {
		return ratingService.saveRating(id, rating);
	}
	
	@DeleteMapping("/{id}")
	@CrossOrigin(origins = "*")
	public String deleteAProperty(@PathVariable("id") Long id) {
		//log.info(" inside deleteAProduct method in Product controller");
		return propertyService.deleteAProduct(id);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/getproperty/{id}")
    public Property getProperty(@PathVariable("id") Long id)
    {
    	return propertyService.getProperty(id);
    }

}

