package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.client.StockPriceClient;

@RestController
public class StockCalculationRestController {

	@Autowired
	private StockPriceClient priceClient;

	@GetMapping("/calculate/{name}/{qty}")
	public ResponseEntity<String> calculate(@PathVariable("name") String companyName,
			@PathVariable("qty") Integer qty) {
		
		ResponseEntity<String> stockPrice = priceClient.getStockPrice(companyName);
		
		if (stockPrice.getStatusCodeValue() == 200) {
			String body = stockPrice.getBody();
			String[] split = body.split("@");

			String response = "Total Cost :: " + Double.parseDouble(split[0]) * qty;
			response = response.concat(" --> Processed By Server Port :: " + split[1]);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		return null;
	}
}
