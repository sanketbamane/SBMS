package com.ashokit.beans;

import org.springframework.stereotype.Service;

@Service("petrol")
public class PetrolEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("** PetrolEngine : Started **");
		return 0;
	}

}
