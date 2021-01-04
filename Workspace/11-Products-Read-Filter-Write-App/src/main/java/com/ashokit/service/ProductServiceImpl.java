package com.ashokit.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private CsvDataReader dataReader;

	@Autowired
	private ProductsDataFilter dataFilter;

	@Autowired
	private CsvDataWriter dataWriter;

	@Override
	public String doProcess(String fileName) throws IOException {

		List<Product> products = dataReader.readProductsData(fileName);

		List<Product> filteredProducts = dataFilter.filterData(products);

		String status = dataWriter.writeProductsData(filteredProducts);

		return status;
	}

}
