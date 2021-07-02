package com.lambda.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lambda.model.Person;

public class CollectionIterationExample {

	public static void main(String[] args) 
	{
		List<Person> persons = Arrays.asList(
				new Person("Rahul", "Yewale", 29),
				new Person("Sagar", "Pawar", 30),
				new Person("Santosh", "Kandhare", 27),
				new Person("Vijay", "Phatak", 26),
				new Person("Sumran", "Singh", 28)
				);
		
		System.out.println("For loop");
		System.out.println("\nFor in loop New");
		System.out.println("For loop 123 New 123");
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		
		System.out.println("\nFor in loop");
		for (Person person : persons) {
			System.out.println(person);
		}
		
		System.out.println("\nFor each loop");
		//persons.forEach(p -> System.out.println(p));
		persons.forEach(System.out::println);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		System.out.println("\nFor each loop for Map");
		map.forEach((key, value) -> System.out.println("Key = "+key+" Value = "+value));
	}

}
