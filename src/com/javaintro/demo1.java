package com.javaintro;

public class demo1 {

	public static void main(String[] args) throws ClassNotFoundException{
     System.out.println("hello welcome to java world started"); 
     System.out.println(Class.forName("java.lang.String"));
     System.out.println(Class.forName("java.lang.System"));
     System.out.println(Class.forName("com.javaintro.demo"));
     
     System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
     System.out.println("hello welcome to java world ended");
	}

}
