package com.biblioteca.test;

import com.biblioteca.Biblioteca;
import com.biblioteca.Libro;
import com.biblioteca.Usuario;

public class BibliotecaTest {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		System.out.println(biblioteca.getLibros());

		Libro libro = new Libro(1, "J.J. Benitez", "Novelas de ciencia ficcion historica ", "Caballo de troya", 45.0,
				2010, "Editorial planeta");

		Usuario usuario = new Usuario("Carolina", "Ramirez", "1048850135", 1);

		System.out.println(usuario);

		biblioteca.agregarLibro(libro);
		System.out.println(biblioteca.getLibros());

		biblioteca.prestarLibro(libro, usuario);
		System.out.println(biblioteca.getLibros());
		System.out.println(usuario);

		Libro libro2 = new Libro(2, "J.J. Benitez", "Novelas de ciencia ficcion historica ", "Caballo de troya", 45.0,
				1995, "Editorial planeta");
		biblioteca.agregarLibro(libro2);
		System.out.println(biblioteca.getLibros());
		System.out.println("Ejercicio 2 \n");
		biblioteca.prestarLibro(libro2, usuario);
		System.out.println(usuario);

	}

}
