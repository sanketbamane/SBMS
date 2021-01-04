package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Order;
import com.ashokit.entity.Student;
import com.ashokit.repository.OrderRepository;
import com.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		Student entity = new Student();
		entity.setStudentName("Ram");
		entity.setStudentGender("Male");
		studentRepository.save(entity);
		
		/*OrderRepository orderRepo = context.getBean(OrderRepository.class);
		Order order = new Order();
		order.setOrderBy("John");
		order.setOrderStatus("CONFIRMED");
		orderRepo.save(order);*/
		
		context.close();
	}

}
