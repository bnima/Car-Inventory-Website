package com.cars.inventory.car.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.cars.inventory.car.repository.CarRepository;



@EnableMongoRepositories(basePackageClasses = CarRepository.class)
@Configuration
public class MongoDBConfig {
}

