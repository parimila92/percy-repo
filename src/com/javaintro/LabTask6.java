package com.javaintro;
public class LabTask6 {
	
   static LabTask6 st=new LabTask6(); // static object reference
	  int rollno;
	  String name;
	  int batch;
	  String mobile;
	  String collegename;  //fields declaration
	  
	 static void m1()
	 {
		 st.rollno = 101;   // intializing data
		 st.name = "percy";
		 st.batch = 81;
		 st.mobile = "9848196456";
		 st.collegename = "Rajiv gandhi university of knowledge technologies";       
	 }
	 void m2()
	 {           
		     m1();
		 System.out.println("Roll no:" + rollno);
		 System.out.println("Name :" + name);
		 System.out.println("Batch:" + batch);
		 System.out.println("Mobile no:" + mobile);
		 System.out.println("College name:" + collegename); //prints data
      }
	public static void main(String[] args)
	{
		  st.m2();
	}

}
