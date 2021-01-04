package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.StockPrice;
import com.ashokit.repository.StockPriceRepository;

@RestController
public class StockPriceRestController {

	@Autowired
	private Environment env;

	@Autowired
	private StockPriceRepository priceRepo;

	@GetMapping("/getCost/{companyName}")
	public ResponseEntity<String> getCostByCompanyName(@PathVariable("companyName") String name) {

		String portNo = env.getProperty("local.server.port");

		StockPrice stockPriceObj = priceRepo.findByCompanyName(name);
		Double stockCost = stockPriceObj.getStockCost();

		String responseBody = stockCost + "@" + portNo;

		return new ResponseEntity<String>(responseBody, HttpStatus.OK);
	}

}
