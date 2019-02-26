package com.app.scheduler.jobmanagementadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class JobmanagementadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobmanagementadminApplication.class, args);
	}

}
