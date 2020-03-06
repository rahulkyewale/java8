package com.study.defaultStaticMethod;

public class Application  
{
	public static void main(String[] args) 
	{
		MyInterface myClass = new MyClass();
		
		myClass.defaultMethod();
		MyInterface.staticMethod();
		myClass.abstractMethod();
		
		MyInterface myClass2 = new MyClass2();
		myClass2.log();
	}
}


