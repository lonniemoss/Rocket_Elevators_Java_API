package com.glory.app.rest;

import com.glory.app.rest.Models.User;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiRocketElevatorApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestApiRocketElevatorApplication.class, args);
		System.out.println("Project started...");

		Configuration cfg = new Configuration();
		cfg.configure("com/glory/app/rest/hibernate.cfg.xml");

		SessionFactory factory =cfg.buildSessionFactory();
		System.out.println("Factory created...");
		System.out.println(User.class.getName());
	}
}


