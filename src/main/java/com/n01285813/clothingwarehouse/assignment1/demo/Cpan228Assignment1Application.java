package com.n01285813.clothingwarehouse.assignment1.demo;

import com.n01285813.clothingwarehouse.assignment1.demo.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class 	Cpan228Assignment1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Cpan228Assignment1Application.class, args);
		HomeController controller = context.getBean(HomeController.class);
	}

}
