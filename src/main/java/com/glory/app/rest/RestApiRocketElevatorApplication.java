package com.glory.app.rest;

import com.glory.app.rest.Models.User;
import io.jsonwebtoken.Jwts;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.glory.app.rest.Repo")
public class RestApiRocketElevatorApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestApiRocketElevatorApplication.class, args);
		System.out.println("Project started...");

		Configuration cfg = new Configuration();
		cfg.configure("com/glory/app/rest/hibernate.cfg.xml");

		SessionFactory factory =cfg.buildSessionFactory();
		System.out.println("Factory created...");
		System.out.println(User.class.getName());
		System.out.println("Session created...");
		System.out.println(Jwts.class.getName());

	}
}


