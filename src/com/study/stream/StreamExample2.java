package com.study.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		
		int a = 10;
		Integer b = 20;
		
		int c = b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		list.add(20);
		list.add(12);
		list.add(18);
		
		list.add(6);
		list.add(4);
		list.add(5);
		
		System.out.println("sumIterator = "+sumIterator(list));
		System.out.println("sumIteratorStream = "+sumIteratorStream(list));
		
		streamForArray();
		
		sortListStream(list);
	}
	

	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}
	
	private static int sumIteratorStream(List<Integer> list) 
	{
		return list.stream()
				.filter(p -> p > 10)
				.mapToInt(i -> i)
				.sum();
	}
	
	private static void streamForArray()
	{
		Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4});
		
		//stream.filter(p -> p>2).forEach(System.out::print);
		
		//List<Integer> list = stream.filter(p -> p>2).collect(Collectors.toList());
		
		int[] array = stream.filter(p -> p>1 && p<4).mapToInt(i -> i).toArray();
		
		//System.out.println(list);
		System.out.println(array);
	}
	
	private static void sortListStream(List<Integer> list)
	{
		list.stream().sorted().forEach(p -> System.out.println(p));
		list.stream().sorted().forEach(System.out::println);
	}
}
