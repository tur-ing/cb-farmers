package com.cibon.farms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//tag::code[]
@SpringBootApplication
@EnableDiscoveryClient
public class CbFarmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbFarmsApplication.class, args);
	}
}
//end::code[]