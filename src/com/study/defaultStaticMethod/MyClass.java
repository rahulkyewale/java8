package com.study.defaultStaticMethod;

public class MyClass implements MyInterface 
{
	@Override
	public void abstractMethod() 
	{
		System.out.println("Inside abstractMethod of Child Class");
	}
	
	/**@Override
	public void defaultMethod()
	{
		System.out.println("Inside in defaultMethod of Child Class");
	}**/
}
