package com.LanguageFundamentals;

public class BankAccount1 {
  static int Accountnumber=3457;
    String Holdername;
    String mobilenumber;
    String IFSCcode;
    double Balance;
      static BankAccount1 b1= new BankAccount1();
      static BankAccount1 b2= new BankAccount1();  
    void m1() 
	{ 
	    Accountnumber=Accountnumber+1;
	   	b1.Holdername="parimila";
	   	b1.mobilenumber="9848196456";
	   	b1.IFSCcode ="IFSC3456";
	   	b1.Balance= 150.00F;  
	   	      m2();  
	         
	     Accountnumber=Accountnumber+1;
	   	  Holdername="asha";
	   	  mobilenumber="9848196376";
	   	  IFSCcode ="IFSC7890";
	   	   Balance= 200.00F;
	   	    m2();   	    
	   	    
	}
     void m2()
     {          
    	 System.out.println("account no:" + Accountnumber);
    	 System.out.println("account no:" + Holdername);
    	 System.out.println("account no:" + mobilenumber);
    	 System.out.println("account no:" + IFSCcode);
    	 System.out.println("account no:" + Balance);
     }	
	public static void main(String[] args) {
		
            b1.m1();
            }
}

