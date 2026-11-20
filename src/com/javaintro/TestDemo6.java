package com.javaintro;

// task 1: calling all methods in the main method

public class TestDemo6 {
	
	static void method1() 
	{
		System.out.println("static method1 called");
	}
	static void method2() 
	{
		System.out.println("static method2 called");
	}

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		method1();
		method2();
		TestDemo6 t = new TestDemo6();
		 t.method3();
		 t.method4();
		System.out.println("main method ended");
	}
	
	void method3() 
	{
		System.out.println("instance method3 called");
	}
	void method4() 
	{
		System.out.println("instance method4 called");
	
}
}