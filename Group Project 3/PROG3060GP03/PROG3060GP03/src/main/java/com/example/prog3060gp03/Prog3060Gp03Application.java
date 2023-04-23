package com.example.prog3060gp03;

import Service.HRManagerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("Model")// Model Package
@EnableJpaRepositories("Repository") // Repository Package

@ComponentScan(basePackageClasses = {HRManagerService.class})// Service Class
public class Prog3060Gp03Application {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Prog3060Gp03Application.class, args);
	// test all Services here
		HRManagerService service = (HRManagerService) ctx.getBean("HRManagerService");
		service.Test();
	}

}
