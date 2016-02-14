package com.cibon.farms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

//tag::code[]
@Data
@Entity
public class Farmer {
	
	private @Id @GeneratedValue Long id;
	private String name;
	private String firstName;
	private String lastName;
	
	private @Version @JsonIgnore Long version;
	
	private Farmer() {}

	public Farmer(String name, String firstName, String lastName) {
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
//end::code[]