package com.github.Radu_A.proyecto_04.java;

class VectorOutOfBoundsException extends RuntimeException {
	public VectorOutOfBoundsException(String message) {
		super(message);
	}
}

public class Vector {
	
	private int y;
	private int x;
	
	public Vector() {
	}

	public Vector(int y, int x) {
		this.y = y;
		this.x = x;
	}
	
	public Vector(int v) {
		this.y = v;
		this.x = v;
	}
	
	public Vector suma(Vector v) {
		Vector resultado = new Vector();
		long resultadoY = this.y + (long)v.y;
		long resultadoX = this.x + (long)v.x;
		if (resultadoY > Integer.MAX_VALUE 
				|| resultadoX > Integer.MAX_VALUE 
				|| resultadoY < Integer.MIN_VALUE 
				|| resultadoX < Integer.MIN_VALUE) {
			throw new VectorOutOfBoundsException("La he liado parda");
		}
		resultado.y = (int)resultadoY;
		resultado.x = (int)resultadoX;
		return resultado;
	}
	
	public String toString() {
		return String.format("Y: %d, X: %d", y, x);
	}
}
