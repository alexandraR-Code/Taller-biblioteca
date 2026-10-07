package com.biblioteca;

import java.util.ArrayList;

//Administra los libros y controla los préstamos. Usa Libro (los guarda) y Usuario (a quien se los presta)
public class Biblioteca {
	// Atributo tipo ArrayList
	private ArrayList<Libro> libros; // Creacion de atributo tipo ArrayList con la clase Libro

	// Constructor vacío: crea la lista de libros vacía.
	public Biblioteca() {
		this.libros = new ArrayList<Libro>();

	}

	// Constructor con lista: recibe libros ya cargados
	public Biblioteca(ArrayList<Libro> libros) {
		this.libros = libros;

	}

	// Metodos getter y setter

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	// Agrega un libro a la biblioteca
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	// Presta un libro a un usuario. Reglas: máximo 3 libros por usuario y un libro
	// prestado no se presta otra vez
	public void prestarLibro(Libro libro, Usuario usuario) {
		if (usuario.getLibrosPrestados().size() >= 3) { // Regla: máximo 3 libros
			System.out.println("No puedes pedir mas de tres libros");
			return;
		}
		for (int i = 0; i < libros.size(); i++) {
			if (libros.get(i).getId() == libro.getId()) { // Encuentra el libro por su id
				if (libros.get(i).isPrestado()) { // Ya está prestado
					System.out.println("Lo sentimos no se pueden prestar");
					return;
				}
				libros.get(i).prestar(); // Lo marca como prestado
				usuario.tomarLibro(libro); // Lo agrega a la lista del usuario
			}
		}
	}
	// Busca un libro por su id. Devuelve el libro o null si no existe.

	public Libro buscarPorId(int id) {
		for (Libro libro : libros) {
			if (libro.getId() == id) {
				return libro;
			}
		}
		return null;
	}

	// Busca un libro por título sin distinguir mayúsculas. Devuelve el libro o null
	public Libro buscarPortitulo(String titulo) {
		for (Libro libro : libros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				return libro;
			}
		}
		return null;
	}

	// Imprime los libros disponibles. Por cada libro prestado imprime "Libros no
	// disponibles".
	public void mostrarLibrosDisponibles() {
		for (Libro libro : libros) {
			if (!libro.isPrestado()) {
				System.out.println(libro);
			} else {
				System.out.println("Libros no disponibles");
			}
		}

	}

	// Imprime los libros de un autor (sin distinguir mayúsculas). Si no hay
	// ninguno, avisa
	public void buscarPorAutor(String nombreAutor) {
		boolean encontrado = false; // Pasa a true si se encuentra al menos un libro del autor

		for (Libro libro : libros) {
			if (libro.getAutor().equalsIgnoreCase(nombreAutor)) {
				System.out.println(libro);
				encontrado = true;
			}

		}
		if (!encontrado) {
			System.out.println("No se encontraron libros de este autor");
		}
	}

	// Imprime los libros con precio menor o igual al precio máximo recibido. Si no
	// hay ninguno, avisa.
	public void buscarPrecioMaximo(double precioMaximo) {
		boolean encontrado = false; // Pasa a true si se encuentra al menos un libro
		for (Libro libro : libros) {
			if (libro.getPrecio() <= precioMaximo) {
				System.out.println(libro);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontraron libros con precio menor o igual al precio máximo");
		}

	}

	// Imprime los libros con precio mayor o igual al precio mínimo recibido. Si no
	// hay ninguno, avisa.
	public void calcularPrecioMinimo(double precioMinimo) {
		boolean encontrado = false; // Pasa a true si se encuentra al menos un libro
		for (Libro libro : libros) {
			if (libro.getPrecio() >= precioMinimo) {
				System.out.println(libro);
				encontrado = true;

			}
		}
		if (!encontrado) {
			System.out.println("No se encontraron libros con precio mayor o igual al precio mínimo");
		}

	}

}
