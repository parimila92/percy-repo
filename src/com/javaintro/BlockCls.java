package com.javaintro;

public class BlockCls {
      // static object reference variable
	  static BlockCls bc3= new BlockCls();
	  static 
	  {
		  System.out.println("this is static block");
		    BlockCls bc3= new BlockCls();
	  }
	  {
		  System.out.println("this is instance block");
	  }
	    void main(String[] args) 
	{
		  System.out.println("this is main method");
	}

}
