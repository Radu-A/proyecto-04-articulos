package com.github.Radu_A.proyecto_04.java;

public class VectorTest {

	public static void main(String[] args) {

		Vector v1 = new Vector(2, 2);
		Vector v2 = new Vector(2147483647, 2147483647);
		Vector v3 = new Vector(2, 2);
		
		try {
			System.out.println(v1.suma(v3));
		} catch (VectorOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Esta suma se ha analizado adecuadamente");
		}
	}

}
