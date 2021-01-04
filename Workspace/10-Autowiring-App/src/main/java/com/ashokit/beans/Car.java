package com.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	@Qualifier("petrol")
	private IEngine eng;

	public void driveCar() {
		int engStatus = eng.start();
		if (engStatus == 0) {
			System.out.println("** Journey Started With Car **");
		}
	}

}
