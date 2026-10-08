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
		if (libro == null) {
			System.out.println("Libro no es valido para ingresar");
			return;
		}
		if (libro.getId() <= 0) {
			libro.setId(libros.size() + 1);

		}
		libros.add(libro);
	}

	// Meodo eliminar libro
	public void eliminarLibro(Libro libro) {
		int indice = obtenerIndece(libro);
		if (indice == -1) {
			System.out.println("No existe libro para eliminar");
			// reetorna se usa para indicar al metodo el fin de su ejecucion
			return;
		}
		libros.remove(indice);
	}

	// POLIMORFISMO
	public Libro eliminarLibro(int indice) {
		Libro libro = null;
		if (indice < 0 || indice >= libros.size()) {
			System.out.println("Indice no es correcto");
			// reetorna se usa para indicar al metodo el fin de su ejecucion
			return libro;
		}
		libro = libros.get(indice);
		libros.remove(indice);
		return libro;
	}

	// Metodo obtener inidce
	public int obtenerIndece(Libro libro) {
		int indice = -1;
		if (libro == null) {
			return indice;
		}
		for (int i = 0; i < libros.size(); i++) {
			if (libros.get(i).getId() == libro.getId()) {
				indice = i;
				break; // Rompe el for, ya no recorre el arregloS
			}
		}
		return indice;
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
			if (libro.getTitulo() != null && libro.getTitulo().equalsIgnoreCase(titulo)) {
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
			if (libro.getAutor() != null && libro.getAutor().equalsIgnoreCase(nombreAutor)) {
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

	// Busca los libros cuyo autor contenga el texto recibido (en cualquier parte
	// del nombre).
	public ArrayList<Libro> buscarPorCadena(String cadena) {
		ArrayList<Libro> lista = new ArrayList<Libro>(); // Siempre inicializamos la lista para evitar un
															// NullPointer...

		for (Libro libro : libros) {
			// toLowerCase(): pasa el texto a minúsculas, así la búsqueda ignora las
			// mayúsculas.
			if (libro.getAutor() != null && libro.getAutor().toLowerCase().contains(cadena.toLowerCase())) { // contains:
																												// ¿el
																												// autor
																												// tiene
																												// este
																												// texto
				// en alguna parte?

				// Si coincide, agrega el libro a la lista de resultados
				lista.add(libro);
			}

		}
		// se puede utilizar de dos maneras size() == 0 o isEmpty
		if (lista.size() == 0) {
			System.out.println("No hay resultados");

		}

		return lista; // Devuelve los libros encontrados (lista vacía si ninguno coincidió)
	}

}
