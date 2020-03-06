package com.study.lambda;


public class LambdaExample {     
    public static void main(String[] args) 
    {         
        String effectivelyFinal = "effectivelyFinal";         
        Runnable lambdaExample1 = () -> System.out.println("LambdaExample " + effectivelyFinal);         
        lambdaExample1.run(); 
        String testMsg = "Test is Success";
        
        //Thread thread = new Thread(() -> printMessage1());
        Thread thread = new Thread(LambdaExample::printMessage1); // () -> method() method reference
        thread.start();
        
        LambdaExample lambdaExample2 = new LambdaExample();
        
        Thread thread2 = new Thread(() -> lambdaExample2.printMessage2());
        thread2.start();
        
       MethodReference methodReference = msg -> System.out.println("Inside printMessage3 = "+msg); 
       MethodReference methodReference1 = System.out::println;  // t -> method(t); 
       methodReference.printMessage3(testMsg);
       methodReference1.printMessage3("Method Reference = "+testMsg);
    } 
    
    public static void printMessage1()
    {
    	System.out.println("Inside printMessage1");
    }
    
    public static void printMessage2()
    {
    	System.out.println("Inside printMessage2");
    }
    
    
}

interface MethodReference
{
	public abstract void printMessage3(String msg);
}
