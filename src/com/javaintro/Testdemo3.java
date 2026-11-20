package com.javaintro;

public class Testdemo3 {
	// static reference variable
	static Testdemo3 t = new Testdemo3();
	// static block
	static {
		System.out.println("static block 1 ");
		Testdemo3 t = new Testdemo3();
	}
	// instance block
	{
		System.out.println("instance block 1");
	}
	void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("main method ended !!");
		 LabTask3 t1 =new LabTask3();  // creating other class object and in other class
		     t1. method1();           // calling other class method
	}
}




