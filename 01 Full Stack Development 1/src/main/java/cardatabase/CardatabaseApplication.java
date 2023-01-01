package cardatabase;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import cardatabase.domain.Car;
import cardatabase.domain.CarRepository;
import cardatabase.domain.Owner;
import cardatabase.domain.OwnerRepository;

/**
 * 
 * Hands-On Full Stack Development with Spring Boot 2 and React
 *
 */


@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	private OwnerRepository orepository;
	
	@Autowired
	private CarRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Owner owner1 = new Owner("John" , "Johnson");
			Owner owner2 = new Owner("Mary" , "Robinson");
			Owner owner3 = new Owner("Gerald", "Craig");
			Owner owner4 = new Owner("Alison", "Craig");
			orepository.save(owner1);
			orepository.save(owner2);
			orepository.save(owner3);
			orepository.save(owner4);
		
		
			repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, owner1));
			repository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, owner2));	
			repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, owner4));
		};
	}
}
