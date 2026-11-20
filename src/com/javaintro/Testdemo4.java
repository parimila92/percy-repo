package com.javaintro;

public class Testdemo4 {
	static Testdemo4 t = new Testdemo4();
	static void method4() 
	{   
		 t.method2();
		System.out.println("method4 called");
	}
	static void method5() 
	{
		method4();
		System.out.println("method5 called");
	}
	
	public static void main(String[] args)
	{
	   System.out.println("main method started");
	   System.out.println("main method ended");
	   Testdemo4 t = new Testdemo4();
	       t.method1();
	}
	void method1()
	{
		method4();
		System.out.println("method1 called");
		 
	}
	void method2()
	{   
		 method3();
		System.out.println("method2 called");
	}
	void method3()
	{   
		System.out.println("method3 called");
	}

}
