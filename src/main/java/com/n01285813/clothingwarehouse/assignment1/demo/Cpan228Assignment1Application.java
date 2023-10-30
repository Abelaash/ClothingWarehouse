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
					.clothingID(1)
					.clothingName("Denim Jacket")
					.brandFrom(Brand.DIOR)
					.yearOfCreation(2022)
					.price(2000).build());

			repository.save(Clothing.builder()
					.clothingID(2)
					.clothingName("Fur Coat")
					.brandFrom(Brand.BALENCIAGA)
					.yearOfCreation(2023)
					.price(40000).build());

			repository.save(Clothing.builder()
					.clothingID(3)
					.clothingName("Special Edition Bag")
					.brandFrom(Brand.BALENCIAGA)
					.yearOfCreation(2022)
					.price(10000).build());

			repository.save(Clothing.builder()
					.clothingID(4)
					.clothingName("Jeans pants")
					.brandFrom(Brand.STONE_ISLAND)
					.yearOfCreation(2021)
					.price(1540).build());

			repository.save(Clothing.builder()
					.clothingID(5)
					.clothingName("Jeans Jacket")
					.brandFrom(Brand.STONE_ISLAND)
					.yearOfCreation(2023)
					.price(1600).build());

			repository.save(Clothing.builder()
					.clothingID(6)
					.clothingName("Sock Shoes")
					.brandFrom(Brand.BALENCIAGA)
					.yearOfCreation(2022)
					.price(50000).build());

			repository.save(Clothing.builder()
					.clothingID(7)
					.clothingName("Plain shirt")
					.brandFrom(Brand.DIOR)
					.yearOfCreation(2023)
					.price(1200).build());

			repository.save(Clothing.builder()
					.clothingID(8)
					.clothingName("2023 Special purse")
					.brandFrom(Brand.BALENCIAGA)
					.yearOfCreation(2023)
					.price(150000).build());
		};
	}
}