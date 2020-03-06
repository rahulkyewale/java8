package com.study.defaultStaticMethod;

public class MyClass2 implements MyInterface, MyInterface2 {

	@Override
	public void abstractMethod() 
	{
		System.out.println("MyClass2 abstractMethod()");
	}

	/**
	 * both interface containing the log method its an multiple inheritance with ambiguity for compiler to call the log()
	 * compiler will force in this case to override either from one of the interface method like below / provide our own implementation
	 */
	@Override
	public void log() {
		// TODO Auto-generated method stub
		System.out.println("\nMultiple Inheritance Compiler force\n");
		MyInterface.super.log();
		MyInterface2.super.log();
		System.out.println("MyClass2 log()");
	}

}
