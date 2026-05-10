package com.github.Radu_A.proyecto_04.java;

import java.util.List;
import java.util.Random;

public class Jaula {
	
	private int id;
	private static int nextId;
	private boolean puertaAbierta;
	private int capacidad;
	private List<Pajaro> pajaros;
	
	public Jaula() {
		id = nextId++;
		puertaAbierta = false;
		Random r = new Random();
		capacidad = r.nextInt(3, 7);
	}
	
	@Override
	public String toString() {
		String resultado = "J-17 ";
		if (pajaros.size() != 0) {
			for (Pajaro pajaro : pajaros) {
				resultado.concat(pajaro.toString());
			}
		}
		return resultado;
	}
}
