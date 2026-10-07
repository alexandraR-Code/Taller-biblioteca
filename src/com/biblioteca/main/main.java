package com.biblioteca.main;

import com.biblioteca.Libro;
import com.biblioteca.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro = new Libro(2,"J.J. Benitez", "Novelas de ciencia ficcion historica ", "Caballo de troya", 45.0, 2010,
				"Editorial planeta");
		libro.prestar();
		System.out.println(libro.toString());
		libro.devolverLibro();
		libro.imprimir();
		System.out.println(libro);

		Libro libro2 = new Libro();
		libro2.setTitulo("Harry Potter");
		System.out.println(libro2);
		libro2.devolverLibro();

		Usuario usuario = new Usuario("Carolina", "Ramirez", "1048850135", 2026);
		usuario.saludar();
		System.out.println(usuario);

	}

}
