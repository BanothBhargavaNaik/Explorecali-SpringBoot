package com.naik.ec.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.naik.ec.domain.TourPackage;

@Repository
public interface TourPackageRepository 
extends CrudRepository<TourPackage, String> {

}
