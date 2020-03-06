package com.study.lambda;

public class NonCapturingLambda 
{     
	public static void main(String[] args) 
	{        
		Runnable nonCapturingLambda = () -> System.out.println("NonCapturingLambda");        
		nonCapturingLambda.run();     
	} 
}
