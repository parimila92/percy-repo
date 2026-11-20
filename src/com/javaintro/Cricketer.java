package com.javaintro;
//programme to represent indian cricket team 
//static variables Vs instance variables
//method area Vs heap area
public class Cricketer {
//static variables - declaration    	
	static int country_id;
	static String country_name;
//instance variable declaration	  
	int jersey_no;
	String cricketer_name;

	public static void main(String[] args) {
		System.out.println("main method started");
//static variables - initialization
		country_id = 91;
		country_name = "india";
// acesssing and printing the static vaiables 
		System.out.println("Country ID : " + country_id);// 0 --> 91
		System.out.println("Country Name  :" + country_name); // null --> india

		Cricketer msd = new Cricketer(); // object creation with class name to access the instance variables
		msd.jersey_no = 4;               // we can create multiple objects
		msd.cricketer_name = "mahendra singh dhoni";
// acesssing and printing the static vaiables 	   
    	System.out.println("Jersey no : " + msd.jersey_no);
		System.out.println("Cricketer name : " + msd.cricketer_name);
	}

}
