package com.javaintro;

public class LabTask5 {
	
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}

  static void method1() {
		System.out.println("method2");
		LabTask5 c = new LabTask5(); // iv) out of scope
		System.out.println("method3");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		LabTask5 t1 = new LabTask5();
		LabTask5 t2 = new LabTask5();
		LabTask5 t3 = new LabTask5();
		
		System.out.println(t1); //@1dbd16a6  prints the adress of the object 1
		System.out.println(t2); //@7ad041f3  prints the adress of the object 2
		System.out.println(t3); //@251a69d7  prints the adress of the object 3

		t1 = null;    // i) nullifying the object
		t2 = t3;     // ii) re-assigning the object
	   new LabTask5().method1();  // iii) anonymous object(independent object)   
		System.gc();  // methods runs the garbage collector
 
		System.out.println(t1); 
		System.out.println(t2); 
		System.out.println(t3);
}

}
