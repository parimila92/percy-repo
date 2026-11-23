package com.LanguageFundamentals;

public class BankAccount2 {
  static int Accountnumber=3457;
    String Holdername;
    String mobilenumber;
    String IFSCcode;
    double Balance;
   
    static void m1() 
	{ 
        BankAccount2 b1= new BankAccount2();
	    Accountnumber=Accountnumber+1;
	   	b1.Holdername="parimila";
	   	b1.mobilenumber="9848196456";
	   	b1.IFSCcode ="IFSC3456";
	   	b1.Balance= 150.00F;  
	   	      b1.m2(); 
	   	      
	   	 BankAccount2 b2= new BankAccount2();
	      Accountnumber=Accountnumber+1;
	   	  b2.Holdername="asha";
	   	  b2.mobilenumber="9848196376";
	   	  b2.IFSCcode ="IFSC7890";
	   	   b2.Balance= 200.00F;
	   	    b2.m2();   	    
	   	    
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
		
             m1();
            }
}


