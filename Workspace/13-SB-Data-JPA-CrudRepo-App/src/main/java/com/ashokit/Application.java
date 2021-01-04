package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.CustomerEntity;
import com.ashokit.repository.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		CustomerRepository repository = context.getBean(CustomerRepository.class);

		/*CustomerEntity entity = new CustomerEntity();
		entity.setCustomerId(104);
		entity.setCustomerName("Mahesh");
		entity.setCustomerEmail("mahesh.g@gmail.com");

		repository.save(entity);*/
		
		/*CustomerEntity entity = repository.findByCustomerEmail("subash.b@gmail.com");
		System.out.println(entity);*/
		
		/*CustomerEntity entity = repository.findByCustomerName("Mahesh");
		System.out.println(entity);
		*/
		
		
		/*CustomerEntity entity = repository.findByCustomerEmailAndCustomerName("ganesh.v@gmail.com", "Ganesh");
		System.out.println(entity);*/
		
		
		/*CustomerEntity customer = repository.getCustomer("Ashok Kumar");
		System.out.println(customer);*/
		
		CustomerEntity entity = repository.findCustomer("Ganesh", "ganesh.v@gmail.com");
		System.out.println(entity);
		
		
		context.close();
	}

}
