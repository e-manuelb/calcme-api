package com.calcme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.calcme.controller.UsuarioController;

@SpringBootApplication
@ComponentScan(basePackageClasses = UsuarioController.class)
public class CalcmeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcmeApiApplication.class, args);
	}

}
