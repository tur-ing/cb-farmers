package com.cibon.farms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//tag::code[]
@Component
public class DatabaseLoader implements CommandLineRunner {

	private final FarmerRepository farmerRepository;
	
	@Autowired
	public DatabaseLoader(FarmerRepository farmerRepository) {
		this.farmerRepository = farmerRepository;
	}
	
	@Override
	public void run(String... strings) throws Exception {
		this.farmerRepository.save(new Farmer("Bauernhof", "Marcel", "Florian"));
		this.farmerRepository.save(new Farmer("Obst & Gemüse", "Natalie", "Florian"));
	}
	
}
//end::code[]