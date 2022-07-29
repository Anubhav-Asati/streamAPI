package com.sapient.aem.service;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class CarService {
	
	public double sumOfPrices(Car[] cars) {
		
		Stream<Car> p=Arrays.stream(cars);
		Optional<Double> o=p
				.map((a)->a.getPrice())
				.reduce((a,b)->a+b);
		if(o.isPresent()) {
			return o.get();
		}
		else {
			return 0.0;
		}
	}
	
	public String[] getCarNames(Car[] cars) {
		
		//String [] obj=Arrays.stream(cars)
		//		.filter((a)->a.getPrice()>1000000.0)
		//		.map((a)->a.getCarName())
		//		.toArray((size->new String[size]));
				
		//return obj;
		
		
		
		Object [] objArray=Arrays.stream(cars)
				.filter((a)->a.getPrice()>1000000.0)
				.map((a)->a.getCarName())
				.toArray();
		String strArray[]= Arrays.copyOf(objArray, objArray.length, String[].class);
		return strArray;

		
		
		
		
		
		
		
		
	}
	
	public double maxPrice(Car[] cars) {
		
		double max=Arrays.stream(cars).map((c)->c.getPrice()).mapToDouble(m->m).max().getAsDouble();
		return max;
		
		
	}
}
