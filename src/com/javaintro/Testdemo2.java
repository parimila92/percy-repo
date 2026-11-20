package com.javaintro;

public class Testdemo2 {
// static method
	static void display() {
		System.out.println("this is static method");
	}
// instance method 
	void welcome() {
		System.out.println("this is instance method");
	}
	
	public static void main(String[] args) {

		System.out.println("main method started");
		
		display();  // static method we can call directly with method name

		Testdemo2 t = new Testdemo2();
		t.welcome(); // instance method we can call using object reference variable inside the static block

		System.out.println("main method ended");

	}

}
