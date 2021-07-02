package com.lambda.main;

public class TypeInferenceExample {

	public static void main(String[] args) {
		printLambda(s -> s.length());
		
	}
	
	
	public static void printLambda(StringLengthLambda l) {
		System.out.print(l.getLength("Hello Lambda"));
		System.out.print(l.getLength("Hello Lambda New"));
		System.out.print(l.getLength("Hello Lambda 123 New 123"));
	}
	
	
	interface StringLengthLambda {
		int getLength(String s);
	}
	
	

}
