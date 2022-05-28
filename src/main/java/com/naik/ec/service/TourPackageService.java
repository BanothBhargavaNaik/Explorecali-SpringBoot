package com.naik.ec.service;

import com.naik.ec.domain.TourPackage;

public interface TourPackageService {
	
	/**
	 * Create a Tour package
	 * 
	 * @param code code of the package
	 * @param name name of the package
	 * 
	 * @return new or existing tour package
	 */
    
	public TourPackage createTourPackage(String code , String name);
	
	
	/**
	 * Lookup All Tour Packages
	 * 
	 *  @return all tour packages
	 */
	public Iterable<TourPackage> lookup();
	
	
}
