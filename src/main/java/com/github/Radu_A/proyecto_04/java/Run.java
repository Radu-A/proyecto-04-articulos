package com.github.Radu_A.proyecto_04.java;

public class Run {

	public static void main(String[] args) {

		System.out.println("Main antes de llamar a m1()");
		
		try {
			MyClass.m1();
		} catch (Exception e) {
			System.out.println("Excepción capturada.");
		}
		
		System.out.println("Main después de llamar a m1()");

	}

}
