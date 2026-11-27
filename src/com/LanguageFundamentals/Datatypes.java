package com.LanguageFundamentals;

public class Datatypes {
	
	 byte item_count=3;
	double item_price=500;
	int discount=50;
	char grade='A';
	int rounded_bill;
	int gradecode;
	double final_bill;

   double Exact_discount= discount;
	
 void method1() {
	int subtotal= (int) (item_count*item_price);
   
   double fb = subtotal - (subtotal * Exact_discount / 100);

      rounded_bill = (int) fb;
      final_bill = (double)fb;
      gradecode = (int) grade;
 
 }
public static void main(String[] args) {

   Datatypes d1 = new Datatypes();

     d1.method1();

   

   System.out.println("Final bill is: " + d1.final_bill);
   System.out.println("Rounded bill is: " +d1.rounded_bill );
   System.out.println("Exact discount is: " + d1.Exact_discount);
   System.out.println("Grade code is: " + d1.gradecode);

}
}
