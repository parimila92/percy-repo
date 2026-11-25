package com.LanguageFundamentals;

public class operations2 {

	int a=10;
	int b=20;
	
  void m1(){
		
		a=a+b;
		m2();
	}
	
	void m2() {
		
		b=a-b;
		display();
	}
	
	void display() {
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
	public static void main(String[] args) {
	     operations2 p =new operations2();
		     p.m1();

	}

}
