package com.cars.inventory.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cars.inventory.car.domain.Car;
import com.cars.inventory.car.repository.CarRepository;


@RestController
@RequestMapping("/rest/cars")
public class CarController {

	@Autowired
    private CarRepository carsRepository;
	
	@GetMapping("/all")
    public List<Car> getAll() {
        return carsRepository.findAll();

    }
	
	@PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
	public void addCar(@RequestBody Car car) {
		carsRepository.save(new Car(car.getId(),car.getColor(),car.getModel(),car.getPrice(),car.getYear()));
	}
}
