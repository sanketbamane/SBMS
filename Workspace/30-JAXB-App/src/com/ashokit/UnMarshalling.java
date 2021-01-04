package com.ashokit;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.ashokit.bindings.Customer;

public class UnMarshalling {

	public static void main(String[] args) throws Exception {

		JAXBContext context = JAXBContext.newInstance(Customer.class);

		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Customer c  = (Customer) unmarshaller.unmarshal(new File("customer.xml"));
		
		System.out.println(c);
	}
}
