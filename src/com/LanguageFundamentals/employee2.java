package com.LanguageFundamentals;
public class employee2 {
	   static int emp_id=101;
	   String emp_name;
	   long mobileno;
	   String dept_name;
	    double base_sal;
	   float total_sal;
	    byte age;
	   boolean active;
	   char gender;
	   float bonus;
  
	void details()
	{
		   emp_id=emp_id+1;
	       emp_name="siri";
		   mobileno=9848196456L;
		   dept_name="cse";
		   base_sal=5000;
		     age=22;
		    active=true;
		    gender='F';
		    bonus=1000.0F;
		    caltotal();
		    
		    emp_id=emp_id+1;
			emp_name="Suma";
			mobileno=6602873889L;
			dept_name="ece";
			base_sal=3000;
			age=24;
			active=true;
			gender='F';
			bonus=200.0F;
			caltotal();
			
			emp_id=emp_id+1;
			emp_name="Mamatha";
			mobileno=5502873889L;
			dept_name="civil";
			base_sal=7000;
			age=21;
			active=false;
			gender='F';
			bonus=300.0F;
	        caltotal();
	}
	 void caltotal()
	 {
		 total_sal = (float)(base_sal + bonus);
		  printing();
	 }
	 
     void printing()
	 {
		System.out.println(" id:" + emp_id);
		System.out.println(" name:" + emp_name);
		System.out.println(" mobileno:" + mobileno);
		System.out.println(" department:" + dept_name);
		System.out.println(" base salary:" + base_sal);
		System.out.println(" age:" + age);
		System.out.println(" active:" + active);
		System.out.println(" gender:" + gender);
		System.out.println(" bonus:" + bonus);
		System.out.println(" total salary:" + total_sal);
		System.out.println("-----------------------------");
	 }
	public static void main(String[] args) {
		   employee2 e2= new employee2();
		     e2.details();
		   
}
}

