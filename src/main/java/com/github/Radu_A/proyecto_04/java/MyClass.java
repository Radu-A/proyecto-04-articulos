package com.github.Radu_A.proyecto_04.java;

public class MyClass {
	
	public static void m1() {
		System.out.println("m1() antes de llamar a m2()");
		m2();
		System.out.println("m1() después de llamar a m2()");
	}
	
	public static void m2() {
		int i = 7 / 0;
		System.out.println("Estamos en el método m2");
	}
}
