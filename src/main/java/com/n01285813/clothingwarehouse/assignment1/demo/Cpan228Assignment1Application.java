package com.n01285813.clothingwarehouse.assignment1.demo;

import com.n01285813.clothingwarehouse.assignment1.demo.controller.HomeController;
import com.n01285813.clothingwarehouse.assignment1.demo.model.Clothing;
import com.n01285813.clothingwarehouse.assignment1.demo.model.Clothing.Brand;
import com.n01285813.clothingwarehouse.assignment1.demo.model.repository.ClothingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class 	Cpan228Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cpan228Assignment1Application.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(ClothingRepository repository) {
		return args -> {
			repository.save(Clothing.builder()
					.clothingName("Pants 1")
					.brandFrom(Brand.DIOR)
					.yearOfCreation(2022)
					.price(2000).build());

			repository.save(Clothing.builder()
					.clothingName("Pants 2")
					.brandFrom(Brand.BALENCIAGA)
					.yearOfCreation(2023)
					.price(40000).build());
		};
	}
}