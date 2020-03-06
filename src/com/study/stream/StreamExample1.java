package com.study.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.lambda.model.Person;

public class StreamExample1 {
	
	private static void sortList(List<Person> list)
	{
		list.stream()
			.sorted((p1,p2) -> p1.getLastName().compareTo(p2.getLastName()))
			.forEach(System.out::println);
	}

	public static void main(String[] args) 
	{
		List<Person> persons = Arrays.asList(
				new Person("Rahul", "Yewale", 29),
				new Person("Sagar", "Pawar", 30),
				new Person("Santosh", "Kandhare", 27),
				new Person("Vijay", "Phatak", 26),
				new Person("Sumran", "Singh", 28)
				);
		System.out.println("\nSort and Print");
		sortList(persons);
		
		
		System.out.println("\nPrint");
		persons.stream().forEach(System.out::println);
		
		System.out.println("\nFilter and Print");
		persons.stream()
			.filter(p -> p.getFirstName().startsWith("S"))
			.forEach(System.out::println);
		
		System.out.println("\nFilter the Result");
		persons = persons.stream()
			.filter(p -> p.getFirstName().startsWith("S"))
			.collect(Collectors.toList());
		
		System.out.println("\nAfter filtering actual collection");
		persons.stream().forEach(System.out::println);
		
		Stream<Person> stream = persons.stream();
		System.out.println(stream);
		
		// Creating an IntStream 
        IntStream stream1 = IntStream.range(4, 10); 
        
  
        // Using IntStream reduce 
        // (int identity, IntBinaryOperator op) 
        int answer = stream1.reduce(0, (num1, num2) 
                                          -> {
                                        	  System.out.println("num1: "+num1+" num2: "+num2);
                                        	  int test = (num1 + num2) - 2 * (num1 - num2);
        										return test;
                                          });
  
        //OptionalInt answer2 = stream1.reduce( (num1, num2) -> (num1 + num2) - 2 * (num1 - num2));
        //System.out.println("answer2"+answer2.getAsInt());
        
        // Displaying the result 
        System.out.println(answer);
		
	}

}
