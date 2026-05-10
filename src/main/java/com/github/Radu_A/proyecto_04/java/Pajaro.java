package com.github.Radu_A.proyecto_04.java;

public class Pajaro {
	
	private int id;
	private static int nextId;
	
	public Pajaro() {
		id = nextId++;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "P-" + id;
	}
	
}
