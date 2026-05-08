package com.github.Radu_A.proyecto_04.java;

public class Test {
	
	public static void main(String[] args) throws ExcepcionChecked {
		
		if(true) throw new ExcepcionChecked("Hola caracola");
		
		try {
			throw new ExcepcionUnchecked("Unchecked");
		} catch (ExcepcionUnchecked e) {
			System.out.println("ExcepcionUnchecked capturada");
		}
		
		System.out.println("PRograma terminado");
		
	}
}
