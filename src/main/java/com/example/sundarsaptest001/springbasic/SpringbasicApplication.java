package com.example.sundarsaptest001.springbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.sundarsaptest001.springbasic.classes.Laptop;

@SpringBootApplication
public class SpringbasicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbasicApplication.class, args);
		Laptop appleA8 = context.getBean(Laptop.class);
		// appleA8.setBrandName("iphone14");
		// appleA8.setLength(100);
		// appleA8.setWidth(14);
		// System.out.println(appleA8.toString());
		appleA8.bootLaptop();
	}

}