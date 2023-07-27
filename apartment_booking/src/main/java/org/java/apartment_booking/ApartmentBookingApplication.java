package org.java.apartment_booking;

import org.java.apartment_booking.employee.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan({"org.java.apartment_booking.security", "other.packages.to.scan"})
public class ApartmentBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApartmentBookingApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(EmployeeService cemployeeService) {
		return args -> System.out.println("My application got started!!");
	}


}
