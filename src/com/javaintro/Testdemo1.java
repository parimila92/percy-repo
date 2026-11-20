package com.javaintro;

public class Testdemo1 {
	static int a ; // static variable  // static variable declaration 

	static { // static block
		System.out.println("Good Morning Have a nice day - 1!!");
		System.out.println("Good Morning Have a nice day - 2!!");
		System.out.println("Good Morning Have a nice day - 3!!");
		System.out.println("A values is : " + a);
	}

	public static void main(String[] args) {

		System.out.println("main method started");
		System.out.println("main method ended");
	}

	static {  // static block
		System.out.println("Good Morning Have a nice day - 4!!");
		System.out.println("Good Morning Have a nice day - 5!!");
		System.out.println("A values is : " + a);
	}
    
}
