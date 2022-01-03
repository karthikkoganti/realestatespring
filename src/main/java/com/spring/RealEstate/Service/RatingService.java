package com.spring.RealEstate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.RealEstate.Repository.RatingRepository;
import com.spring.RealEstate.model.Rating;

@Service
public class RatingService {
	
	@Autowired
	private RatingRepository ratingRepository;
	
	
	public Rating saveRating(Long id, Rating rating) {
		Rating rat = new Rating();
		rat.setId(id);
		rat.setComment(rating.getComment());
		rat.setRate(rating.getRate());
		return ratingRepository.save(rat);
	}

}
