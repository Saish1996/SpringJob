package com.spring.schedulercron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({ "com.jobscheduler" })
@EnableScheduling
public class SchedulercronApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulercronApplication.class, args);
	}

}
