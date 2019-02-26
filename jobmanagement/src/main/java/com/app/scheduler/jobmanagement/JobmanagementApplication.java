package com.app.scheduler.jobmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
//@EnableAdminServer
@ComponentScan(basePackages = "com.app.scheduler.jobmanagement")
public class JobmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobmanagementApplication.class, args);
	}

}
