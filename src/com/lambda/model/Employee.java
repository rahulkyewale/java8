package com.lambda.model;

import java.util.Optional;

public class Employee 
{
	private Integer id;
	
	private String name;
	
	private Optional<Address> address;

	public Employee(Integer id, String name, Optional<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	public void setAddress(Optional<Address> address) {
		this.address = address;
	}
	
	
}
