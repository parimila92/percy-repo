package com.LanguageFundamentals;

public class products {
	  static int product_id=100;
	   String product_name;
	   long mobileno;
       String Category_name;
       float base_price;
       float total_price;
       double tax_amount;
       float discount;
       void method1()
       {
    	   product_id =product_id+1;
   		   product_name="Sirisha";
   		   mobileno=7702873889L;
   		   Category_name="APPLE";
   		   base_price=1000.00F;
   		   tax_amount=500.00F;
   		   discount=10;
   		   method2();
   		   
   		  product_id =product_id+1;
 		   product_name="percy";
 		   mobileno=7702873889L;
 		   Category_name="windows";
 		   base_price=2000.00F;
 		   tax_amount=300.00F;
 		   discount=20;
 		   method2();
 		   
   		   
       }
       void method2()
       {
    	   total_price= base_price+discount;
    	   discount= total_price+discount/100;
    	     display();
       }
       void display()
       {
    		System.out.println("Product_id:"+product_id);
    		System.out.println("Product_name:"+product_name);
    		System.out.println("Mobile_number:"+mobileno);
    		System.out.println("Category_name:"+Category_name);
    		System.out.println("Base_price:"+base_price);
    		System.out.println("TaxAmount:"+tax_amount);
    		System.out.println("Total_price=:"+total_price);
    		System.out.println("Discount:"+discount);
    		System.out.println();
       }
	public static void main(String[] args) {
          products p= new products();
           p.method1();
		
	}	
}
