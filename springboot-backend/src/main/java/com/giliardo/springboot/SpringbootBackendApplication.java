package com.giliardo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.giliardo.springboot.entity.Employee;
import com.giliardo.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee employee1 = Employee.builder()
				.firstName("Giliardo")
				.lastName("Junior")
				.email("giliardojunior@gmail.com")
				.build();
		
		Employee employee2 = Employee.builder()
				.firstName("Jonas")
				.lastName("Jeronimo")
				.email("jonas@gmail.com")
				.build();
		
		Employee employee3 = Employee.builder()
				.firstName("Fernanda")
				.lastName("Cristina")
				.email("fercristina@gmail.com")
				.build();
		
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		
	}

}
