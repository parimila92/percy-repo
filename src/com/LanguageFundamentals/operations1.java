package com.LanguageFundamentals;

public class operations1 {

	int a;
	int b;
    int sum;
	int substract;
	
   void sum()
	{
		a=10;
		b=20;
	    sum = a+b;	
	    substract();
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
	
	public  void main(String[] args) {
	           sum();
            
	}

}
