package com.study.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AggregateFunction {

	public static void main(String[] args) 
	{
		IntSummaryStatistics stats = Arrays.asList(1,2,3,4)
			    .stream()
			    .mapToInt(Integer::intValue)
			    .summaryStatistics();

		stats.getSum();
		stats.getCount();
		stats.getAverage();
		
		List<Object> listObj = Arrays.asList(11,12,15,13);
		
		Stream<Object> objStream = listObj.stream();
		IntStream intStream = objStream.mapToInt(i -> Integer.parseInt(i.toString()));
		
		Integer sum = intStream.sum();
		
		System.out.println("SUM = "+sum);
		
		String str = "rahul";
		
		String reversed = str.chars()
			    .mapToObj(c -> (char)c)
			    .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
	}

}
