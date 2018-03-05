package com.cars.inventory.car.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cars.inventory.car.domain.Car;




public interface CarRepository extends MongoRepository<Car, Integer> {
	
}
