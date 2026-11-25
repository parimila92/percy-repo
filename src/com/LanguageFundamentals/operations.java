package com.LanguageFundamentals;

public class operations {

	int a;
	int b;
	static int sum;
	int substract;
	
 static operations p = new operations();
 
  static void sum()
	{
		p.a=10;
		p.b=20;
	    sum = p.a+p.b;	
	    p.substract();
	}
	void substract()
	{
		a=30;
		b=10;
		substract= a-b;
		print();
	}
	void print()
	{
		System.out.println("sum:" +sum);
		System.out.println("substract:" +substract);
		
	}
	
	public static void main(String[] args) {
	       sum();
            
	}

}
