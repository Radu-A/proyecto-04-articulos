package com.github.Radu_A.proyecto_04.java;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private static List<Libro> libros = crearLista();

	private static List<Libro> crearLista() {
		List<Libro> libros = new ArrayList<>();
		Libro l2 = new Libro("Don Quijote de la Mancha", false);
		// Clásicos de la literatura en español
		libros.add(new Libro("Cien años de soledad", true));  // PRESTADO
		libros.add(l2);
		libros.add(new Libro("Rayuela", true));               // PRESTADO
		libros.add(new Libro("Ficciones", false));
		libros.add(new Libro("Pedro Páramo", false));
		libros.add(new Libro("Crónica de una muerte anunciada", true)); // PRESTADO
		libros.add(new Libro("La sombra del viento", false));
		
		// Distopías y Ciencia Ficción
		libros.add(new Libro("1984", true));                  // PRESTADO
		libros.add(new Libro("Un mundo feliz", false));
		libros.add(new Libro("Fahrenheit 451", true));        // PRESTADO
		libros.add(new Libro("Viaje al fin de la noche", false));
		
		// Clásicos universales
		libros.add(new Libro("El principito", false));
		libros.add(new Libro("Orgullo y prejuicio", true));   // PRESTADO
		libros.add(new Libro("El señor de los anillos", false));
		libros.add(new Libro("Matar a un ruiseñor", true));   // PRESTADO
		libros.add(new Libro("La Odisea", false));
		libros.add(new Libro("Crimen y castigo", true));      // PRESTADO
		libros.add(new Libro("La metamorfosis", false));
		libros.add(new Libro("El retrato de Dorian Gray", false));
		libros.add(new Libro("Los miserables", true));        // PRESTADO
		libros.add(new Libro("Ensayo sobre la ceguera", false));
		libros.add(new Libro("Siddhartha", false));
		
		// Novela Gótica y de Aventuras
		libros.add(new Libro("Frankenstein", true));          // PRESTADO
		libros.add(new Libro("Drácula", false));
		libros.add(new Libro("El conde de Montecristo", true)); // PRESTADO
		
		return libros;
	}

	public static void add(Libro libro) {
		libros.add(libro);
	}

	public static void prestar(Libro libroSolicitado) throws LibroNoExistenteException {
		if (libros.contains(libroSolicitado)) {
			for (Libro libro : libros) {
				if (libroSolicitado.getTitulo().equals(libro.getTitulo()))
					try {
						libro.prestar();
					} catch (LibroYaPrestadoException e) {
						e.getMessage();
					}
				return;
			}
		}
		throw new LibroNoExistenteException(libroSolicitado + " no existe");
	}
	
	public static void devolver(Libro libroDevuelto) throws LibroNoExistenteException {
		if (libros.contains(libroDevuelto)) {
			for (Libro libro : libros) {
				if (libroDevuelto.getTitulo().equals(libro.getTitulo()))
					try {
						libro.devolver();
					} catch (LibroNoPrestadoException e) {
						e.getMessage();
					}
				return;
			}
		}
		throw new LibroNoExistenteException(libroDevuelto + " no existe");
	}
}
