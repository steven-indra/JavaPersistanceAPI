package com.example;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaPersistanceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaPersistanceApiApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository repository;
	
	@Bean
	public CommandLineRunner printAll(ApplicationContext ctx){
		return args -> {
			Employee e = new Employee();
			e.setFirstName("John");
			e.setLastName("Travis");
			e.setDob(new Date());
			e.setGender("Male");
			Employee e1 = new Employee();
			e1.setFirstName("John");
			e1.setLastName("Lala");
			e1.setDob(new Date());
			e1.setGender("Male");
			repository.save(e);
			repository.save(e1);
		};
	}
}
