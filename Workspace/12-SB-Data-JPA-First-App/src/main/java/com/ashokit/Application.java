package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.EmpDtlsService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpDtlsService empDtlsService = context.getBean(EmpDtlsService.class);
		// empDtlsService.saveEmp();
		empDtlsService.getEmpById();
		// empDtlsService.getAllEmps();
		// empDtlsService.deleteEmp();
		// empDtlsService.updateEmp();

		context.close();
	}

}
