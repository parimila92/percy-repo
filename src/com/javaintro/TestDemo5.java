package com.javaintro;
public class TestDemo5 {
	static TestDemo5 t = new TestDemo5();
	static void method5() {
		System.out.println("method5 called ");
		t.method6();
	}
	void method6() {
		System.out.println("method6 called ");
	}
	// In Static methods, if we want to call instance methods, we must need to
	// create object
	static void method2() {
		t.method3();
		System.out.println("method2 called ");
	}
	// inside static methods, we can call static methods directly
	static void method1() {
		method2();
		System.out.println("method1 called ");
	}
	public static void main(String[] args) {
		System.out.println("main method started ");
		method1();
		System.out.println("main method ended ");
	}
//	in instance methods, can we call instance methods directly ..? Yes
	void method3() {
		method4();
		System.out.println("method3 called ");
	}
//	in instance methods, Can we call static methods directly ..? Yes
	void method4() {
		System.out.println("method4 called ");
		method5();
	}
}




