package com.javaintro;
public class gc1 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !!");
	}
	
	void hello(){
		System.out.println("Good morning guys !!");
		System.out.println("Good morning guys !!");
		gc1 e = new gc1();//iv) Out of Scope
		System.out.println("Good morning guys !!");
	}
	public static void main(String[] args) {
		System.out.println("main method started ");
		gc1 e1 = new gc1();
		gc1 e2 = new gc1();
		gc1 e3 = new gc1();
		/////Address of the Objects
		System.out.println(e1);///1dbd16a6 - HexaDecimal Literals
		System.out.println(e2);///7ad041f3
		System.out.println(e3);///251a69d7
//		i) Nullifying the Objects
		e1 = null;
//		ii)Re-assiging the Reference
		e3 = e2;
		
//		iii) Anonymous object --> Independent
		new gc1().hello();
		// Runs the garbage collector.
		System.gc();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("main method ended ");
	}
}




