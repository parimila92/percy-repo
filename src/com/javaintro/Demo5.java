package com.javaintro;

public class Demo5 {
  static int x;  // static variable can be applied to every object 
    // instance block
	{
		x=x+1;
	}
	public static void main(String[] args) {
	// in static we canot acess instance so we can create object 
		
		Demo5 a = new Demo5();  
		Demo5 b = new Demo5();
	    Demo5 c = new Demo5();
	    
	System.out.println("count:"+a.x);
	System.out.println("count:"+b.x);
	System.out.println("count:"+c.x);

	}
}

