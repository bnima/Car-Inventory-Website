package com.cars.inventory.car.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Car {
	
	@Setter
	@Getter
	private String id;
	@Setter
	@Getter
	private String color;
	@Setter
	@Getter
	private String model;
	@Setter
	@Getter
	private String year;
	@Setter
	@Getter
	private String price;
}
