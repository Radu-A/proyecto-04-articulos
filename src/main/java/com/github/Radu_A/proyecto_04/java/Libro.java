package com.github.Radu_A.proyecto_04.java;

public class Libro {
	
	private String titulo;
	private boolean prestado;
	
	public Libro() {}
	
	public Libro(String titulo, boolean prestado) {
		super();
		this.titulo = titulo;
		this.prestado = prestado;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public void prestar() throws LibroYaPrestadoException {
		if (!prestado) prestado = true;
		throw new LibroYaPrestadoException(this + " ya está prestado");
	}
	
	public void devolver() throws LibroNoPrestadoException {
		if (prestado) prestado = false;
		throw new LibroNoPrestadoException(this + " no ha sido prestado");
	}
	
	@Override
	public String toString() {
		return String.format("Libro %s", titulo);
	}
}
