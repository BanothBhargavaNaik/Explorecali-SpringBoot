package com.naik.ec.repo;

import org.springframework.data.repository.CrudRepository;

import com.naik.ec.domain.Tour;

public interface TourRepository
extends CrudRepository<Tour, Integer> {

}
