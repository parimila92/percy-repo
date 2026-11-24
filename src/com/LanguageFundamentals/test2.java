package com.LanguageFundamentals;

public class test2 {

	static int x=10;
	int y =20;
	
	static void Method1() {
		test2 t=new test2();
		
	x=50;
	t.y=100;
	t.display();
	
	test2 t1=new test2();
	t1.display();
	
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
		
	}
	
	public static void main(String[] args) {
		
		Method1();

	}

}