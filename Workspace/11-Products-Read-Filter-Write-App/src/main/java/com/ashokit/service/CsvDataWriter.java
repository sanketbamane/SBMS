package com.ashokit.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ashokit.model.Product;

@Component
public class CsvDataWriter {

	public String writeProductsData(List<Product> products) throws IOException {

		FileWriter fw = new FileWriter("filtered-products.csv");

		products.forEach(p -> {
			try {

				fw.write(p.getProductId() + "," + p.getProductName() + "," + p.getProductPrice());
				fw.write("\n");

			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		fw.close();

		return "SUCCESS";
	}

}
