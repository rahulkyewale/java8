package com.study.defaultStaticMethod;

public interface MyInterface2 
{
	default void log()
	{
		System.out.println("MyInterface2 log()");
	}
}
