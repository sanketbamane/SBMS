package com.ashokit.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ashokit.model.Product;

@Component
public class CsvDataReader {

	public List<Product> readProductsData(String fileName) throws IOException {

		List<Product> products = new ArrayList<Product>();

		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);

		String productData = br.readLine();

		while (productData != null) {
			String[] productArr = productData.split(",");
			String productId = productArr[0];
			String productName = productArr[1];
			String productPrice = productArr[2];

			Product p = new Product();
			p.setProductId(Integer.parseInt(productId));
			p.setProductName(productName);
			p.setProductPrice(Double.parseDouble(productPrice));

			products.add(p);

			// reading nextline data
			productData = br.readLine();
		}

		br.close();

		return products;
	}
}
