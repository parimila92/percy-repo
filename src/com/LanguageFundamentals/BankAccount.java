package com.LanguageFundamentals;

public class BankAccount {
  static int Accountnumber=3457;
    String Holdername;
    String mobilenumber;
    String IFSCcode;
    double Balance;
      static BankAccount b1= new BankAccount();
      static BankAccount b2= new BankAccount();  
   static void m1() 
	{ 
	    Accountnumber=Accountnumber+1;
	   	b1.Holdername="parimila";
	   	b1.mobilenumber="9848196456";
	   	b1.IFSCcode ="IFSC3456";
	   	b1.Balance= 150.00F;  
	   	     m2();     
	         
	    Accountnumber=Accountnumber+1;
	   	b2.Holdername="asha";
	   	b2.mobilenumber="9848196376";
	   	b2.IFSCcode ="IFSC7890";
	   	b2.Balance= 200.00F;
	   	    m2();   	    
	}
    static void m2()
     {  
    	 System.out.println("account no:" + b1.Accountnumber);
    	 System.out.println("account no:" + b1.Holdername);
    	 System.out.println("account no:" + b1.mobilenumber);
    	 System.out.println("account no:" + b1.IFSCcode);
    	 System.out.println("account no:" + b1.Balance);
     }	
	public static void main(String[] args) {
		
            b1.m1();
            }
}
