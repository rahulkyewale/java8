package com.study.optional;

import java.util.Optional;

import com.lambda.model.Address;
import com.lambda.model.Employee;

public class OptionalExample {

	public static void main(String[] args) 
	{
		Employee employee1 = new Employee(1, "Rahul", Optional.empty());
		Employee employee2 = new Employee(1, "Rahul", Optional.of(new Address("Pune", "Maharashtra", "India")));
		
		if(!employee1.getAddress().isPresent())
		{
			System.out.println("Test is Success");
		}
		
		if(employee2.getAddress().isPresent())
		{
			System.out.println(employee2.getAddress().get().getCity());
		}
		
	}

}
