package com.study.defaultStaticMethod;

// Interface which has only one abstract method is called Functional Interface
@FunctionalInterface
public interface MyInterface 
{
	default void defaultMethod()
	{
		System.out.println("Inside in defaultMethod");
	}
	
	default void log()
	{
		System.out.println("MyInterface log()");
	}
	
	static void staticMethod()
	{
		System.out.println("Inside in staticMethod");
	}
	
	public abstract void abstractMethod();
}
