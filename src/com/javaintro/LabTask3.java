package com.javaintro;

public class LabTask3 {
	static LabTask3 t3 = new LabTask3();
	static void method1() 
	{
		method2();
	System.out.println("static method1 called");
	}
	static void method2() 
	{
		t3.method3();
		System.out.println("static method2 called");
	}

	public static void main(String[] args) 
	{
		  method1();	
	}
	
	void method3() 
	{
		method4();
		System.out.println("instance method3 called");
	}
	void method4() 
	{
		System.out.println("instance method4 called");
	
}
}
