package com.study.forEachIterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Java8ForEachExample {

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		// old way of iterating
		for (Integer integer : list) 
		{
			if(integer == 5)
			{
				// ConcurrentModificationException exception
				//list.remove(integer);
			}
		}
		
		System.out.println("Print with iterator \n");
		// old way of iterating
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) 
		{
			// llegalStateException Exception
			//iterator.remove();
			Integer listElement = iterator.next();
			if(listElement == 5)
			{
				// run successful without any Exception
				//iterator.remove();
				
				// ConcurrentModificationException exception
				//list.remove(listElement);
			}
			
			System.out.println(listElement);
		}
		
		System.out.println("\nPrint with forEach() method of Iterable interface\n");
		//java8 way of iteration (Java8 has added the new method in Iterable interface forEach() with definition)
		list.forEach( new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}	
		} );
		
		System.out.println("List");
		MyConsumer action = new MyConsumer();
		list.forEach(action);
		System.out.println("Set");
		
		System.out.println("With Lambda");
		list.forEach(t -> System.out.println(t));
	}

}

class MyConsumer implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		System.out.println("List at "+(t-1)+" = "+t);
	}
	
}
