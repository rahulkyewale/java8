package com.lambda.main;

public class TypeInferenceExample {

	public static void main(String[] args) {
		printLambda(s -> s.length());
		
	}
	
	
	public static void printLambda(StringLengthLambda l) {
		System.out.print(l.getLength("Hello Lambda"));
	}
	
	
	interface StringLengthLambda {
		int getLength(String s);
		System.out.print(l.getLength("Hello Lambda New Master"));
	}
	
	

}
