package com.LanguageFundamentals;
public class employee1 {
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
	    
	static void details()
	{
		employee1 e1 = new employee1(); 
           e1.emp_id=emp_id+1;
	       e1.emp_name="siri";
		   e1.mobileno=9848196456L;
		   e1.dept_name="cse";
		   e1.base_sal=5000;
		     e1.age=22;
		    e1.active=true;
		    e1.gender='F';
		    e1.bonus=1000.0F;
		    e1.caltotal();
		    
		    e1.emp_id=emp_id+1;
			e1.emp_name="Suma";
			e1.mobileno=6602873889L;
			e1.dept_name="ece";
			e1.base_sal=3000;
			e1.age=24;
			e1.active=true;
			e1.gender='F';
			e1.bonus=200.0F;
			e1.caltotal();
			
			e1.emp_id=emp_id+1;
			e1.emp_name="Mamatha";
			e1.mobileno=5502873889L;
			e1.dept_name="civil";
			e1.base_sal=7000;
			e1.age=21;
			e1.active=false;
			e1.gender='F';
			e1.bonus=300.0F;
	        e1.caltotal();
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
		    details();	
}
}

