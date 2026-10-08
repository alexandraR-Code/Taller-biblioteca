package com.biblioteca.test;

import java.util.ArrayList;

import com.biblioteca.Biblioteca;
import com.biblioteca.Libro;

public class BibliotecaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro l1 = new Libro(1, "J.J. Benitez", "Novelas de ciencia ficcion historica ", "Caballo de troya", 45.0, 2010,
				"Editorial planeta");
		Libro l2 = new Libro(2, "Gabriel Garcia Marquez", "Novelas de ciencia ficcion historica ", "Caballo de troya",
				45.0, 2010, "Editorial planeta");
		Libro l3 = new Libro(3, "Brandon Leon", "Novelas de ciencia ficcion historica ", "Caballo de troya", 45.0, 2010,
				"Editorial planeta");
		Libro l4 = new Libro(4, "James Clear", "Novelas de ciencia ficcion historica ", "Caballo de troya", 45.0, 2010,
				"Editorial planeta");
		Libro l5 = new Libro("J.K. Rowling", "Novelas de ciencia ficcion historica ", "Caballo de troya", 45.0, 2010,
				"Editorial planeta");

		Biblioteca b1 = new Biblioteca();
		b1.agregarLibro(l1);
		b1.agregarLibro(l2);
		b1.agregarLibro(l3);
		b1.agregarLibro(l4);
		b1.agregarLibro(l5);

		System.out.println("Libros: " + b1.getLibros());

		ArrayList<Libro> libros = b1.buscarPorCadena("ben");
		System.out.println("Libros encontrados: " + libros);
		System.out.println();
		System.out.println("Eliminar registro");
		System.out.println("Cantidad de libros: " + b1.getLibros().size());
		b1.eliminarLibro(new Libro());
		System.out.println("cantidad de libros con new Libro(): " + b1.getLibros().size());
		
		
		b1.eliminarLibro(null);
		System.out.println("cantidda de libros con null: " + b1.getLibros().size());

		// con indice
		Libro libro = b1.eliminarLibro(2);
		System.out.println("Cantidda de libros cn indice: " + b1.getLibros().size());
		System.out.println("Libro eliminado: " + libro);
	}

}
