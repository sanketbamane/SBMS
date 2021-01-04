package com.ashokit;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.ashokit.bindings.Customer;

public class Marshalling {

	public static void main(String[] args) throws Exception {

		Customer c = new Customer();
		c.setCustomerId(101);
		c.setCustomerName("Ashok");
		c.setCustomerEmail("ashokitschool@gmail.com");
		c.setType("Permanent");

		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(c, new File("customer.xml"));
	}

}
