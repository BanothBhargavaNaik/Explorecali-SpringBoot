package com.naik.ec.service;

import com.naik.ec.domain.Difficulty;
import com.naik.ec.domain.Region;
import com.naik.ec.domain.Tour;

public interface TourService {
	
	
	/**
	 * 
	 * @param title title
	 * @param description description
	 * @param blurb blurb
	 * @param price price
	 * @param duration duration
	 * @param bullets comma-separated bullets
	 * @param keywords keywords
	 * @param tourPackageName tour package Name
	 * @param difficulty difficulty
	 * @param region region
	 * @return Tour Entity
	 */
	public Tour createTour(String title, String description ,String blurb,
			Integer price, String duration, String bullets,String keywords
			,String tourPackageName,Difficulty difficulty,Region region );
	
	

}
