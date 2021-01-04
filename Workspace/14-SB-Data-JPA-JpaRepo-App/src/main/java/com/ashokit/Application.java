package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import com.ashokit.entity.CustomerEntity;
import com.ashokit.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		CustomerRepository repository = context.getBean(CustomerRepository.class);

		/*CustomerEntity entity = new CustomerEntity();
		entity.setCustomerId(105);
		entity.setCustomerName("Ram");
		entity.setCustomerEmail("ram.k@gmail.com");
		repository.save(entity);*/
		
		/*List<CustomerEntity> customersList = repository.findAll();
		customersList.forEach(customer -> {
			System.out.println(customer);
		});*/
		
		/*List<CustomerEntity> customersList = repository.findAll(Sort.by("customerName").ascending());
		List<CustomerEntity> customersList = 
				repository.findAll(Sort.by("customerName").descending());
		customersList.forEach(customer -> {
			System.out.println(customer);
		});*/
		
		/*PageRequest page = PageRequest.of(1, 3);
		Page<CustomerEntity> findAll = repository.findAll(page);
		List<CustomerEntity> customersList = findAll.getContent();
		customersList.forEach(customer -> {
			System.out.println(customer);
		});*/
		
		CustomerEntity entity = new CustomerEntity();
		entity.setCustomerName("Ashok Kumar");
		Example<CustomerEntity> example = Example.of(entity);
		List<CustomerEntity> customersList = repository.findAll(example);
		customersList.forEach(customer -> {
			System.out.println(customer);
		});

		context.close();
	}

}
