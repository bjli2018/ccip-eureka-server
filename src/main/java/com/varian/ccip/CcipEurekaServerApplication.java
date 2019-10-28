package com.varian.ccip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CcipEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcipEurekaServerApplication.class, args);
	}

}
