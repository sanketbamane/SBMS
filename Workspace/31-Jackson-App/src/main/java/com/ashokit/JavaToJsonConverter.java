package com.ashokit;

import java.io.File;

import com.ashokit.binding.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {

		Product p = new Product();
		p.setProductId(101);
		p.setProductName("Keyboard");
		p.setProductPrice(15000.00);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("product.json"), p);
	}
}
