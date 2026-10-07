package com.biblioteca.main;

import com.biblioteca.Libro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro = new Libro();
		libro.autor = "J.J. Benitez";
		libro.titulo = "Caballo de troya";
		libro.anio = 2010;

		System.out.println(libro.autor + " " + libro.titulo + " " + libro.anio);

	}

}
