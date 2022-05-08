package com.sm;

import com.sm.model.Employee;
import com.sm.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		if(employeeRepository.count() == 0 ) {
			employeeRepository.save(new Employee("Ali", "IT", 25));
			employeeRepository.save(new Employee("Hunain", "IT", 35));
			employeeRepository.save(new Employee("Awais", "OPERATION", 45));
			employeeRepository.save(new Employee("Mubashir", "NETWORK", 55));
		}
	}
}
