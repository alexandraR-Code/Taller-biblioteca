package com.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	// Atributo tipo ArrayList
	private ArrayList<Libro> libros; // Creacion de atributo tipo ArrayList con la clase Libro

	// Constructor vacio
	public Biblioteca() {
		this.libros = new ArrayList<Libro>();

	}

	// Constructor inicializado de tipo ArrayList
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

	// Metodo agregar libro
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	// metodo agregar libro
	public void prestarLibro(Libro libro, Usuario usuario) {
		if (usuario.getLibrosPrestados().size() >= 3) {
			System.out.println("No puedes pedir mas de tres libros");
			return;
		}
		for (int i = 0; i < libros.size(); i++) {
			if (libros.get(i).getId() == libro.getId()) {
				if (libros.get(i).isPrestado()) {
					System.out.println("Lo sentimos no se pueden prestar");
					return;
				}
				libros.get(i).prestar();
				usuario.tomarLibro(libro);
			}
		}
	}

}
