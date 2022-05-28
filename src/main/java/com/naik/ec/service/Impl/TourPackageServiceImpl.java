package com.naik.ec.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.naik.ec.domain.TourPackage;
import com.naik.ec.repo.TourPackageRepository;
import com.naik.ec.service.TourPackageService;

public class TourPackageServiceImpl implements TourPackageService {

	private TourPackageRepository tourPackageRepository;

	@Autowired
	public TourPackageServiceImpl(TourPackageRepository tourPackageRepository) {

		this.tourPackageRepository = tourPackageRepository;
	}

	@Override
	public TourPackage createTourPackage(String code, String name) {

		return tourPackageRepository.findById(code).orElse(tourPackageRepository.save(new TourPackage(code, name)));
	}

	@Override
	public Iterable<TourPackage> lookup() {
	
		return tourPackageRepository.findAll();
	}

	public long total() {
		return tourPackageRepository.count();
	}
}
