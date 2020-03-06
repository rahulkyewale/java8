/**
 * 
 */
package com.lamda.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.lambda.model.Person;

/**
 * @author rahulyewale
 *
 */
public class ExcerciseUsingJava7 
{
	public static void printAll(List<Person> persons)
	{
		for (Person person : persons) {
			System.out.println(person);
		}
		System.out.println();
	}
	
	public static void printConditionally(List<Person> persons, Condition condition)
	{
		for (Person person : persons) {
			if(condition.test(person))
			{
				System.out.println(person);
			}
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		List<Person> persons = Arrays.asList(
				new Person("Rahul", "Yewale", 29),
				new Person("Sagar", "Pawar", 30),
				new Person("Santosh", "Kandhare", 27),
				new Person("Vijay", "Phatak", 26),
				new Person("Sumran", "Singh", 28)
				);
		
		printAll(persons);
		
		// Step 1: Sort list by last name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all the persons");
		printAll(persons);
		
		// Step 3: Create a method that prints all people that have last name beginning with P
		System.out.println("Printing person whose last name start with P using foreach");
		for (Person person : persons) {
			if(person.getLastName().startsWith("P"))
			{
				System.out.println(person);
			}
		}
		System.out.println();
		
		// Step 3: Create a method that prints all people that have last name beginning with P
		System.out.println("Printing person whose last name start with P using condition");
		printConditionally(persons, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("P");
			}
		});
		
		// Step 4: Create a method that prints all people that have first name beginning with S
		System.out.println("Printing person whose First name start with S using condition");
		printConditionally(persons, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("S");
			}
		});
				
	}

}