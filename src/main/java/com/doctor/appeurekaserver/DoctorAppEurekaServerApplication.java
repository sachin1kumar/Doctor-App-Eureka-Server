package com.doctor.appeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DoctorAppEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorAppEurekaServerApplication.class, args);
	}

}
