package com.ashokit.beans;

import org.springframework.stereotype.Service;

@Service("diesel")
public class DieselEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("** DieselEngine : Started **");
		return 0;
	}
}
