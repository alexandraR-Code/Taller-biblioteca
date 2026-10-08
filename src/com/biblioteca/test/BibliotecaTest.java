package com.biblioteca.test;

import com.biblioteca.Biblioteca;
import com.biblioteca.Libro;
import com.biblioteca.Usuario;

//Prueba de Biblioteca: agrega libros, presta hasta el límite de 3 y prueba las búsquedas
public class BibliotecaTest {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		System.out.println(biblioteca.getLibros());

		Libro libro1 = new Libro(1, "J.J. Benitez", "Novelas de ciencia ficcion historica ", "Caballo de troya", 45.0,
				2010, "Editorial planeta");

		Usuario usuario1 = new Usuario("Carolina", "Ramirez", "1048850135", 1);

		System.out.println(usuario1);

		biblioteca.agregarLibro(libro1);
		System.out.println(biblioteca.getLibros());

		biblioteca.prestarLibro(libro1, usuario1);
		System.out.println(biblioteca.getLibros());
		System.out.println(usuario1);

		Libro libro2 = new Libro(2, "Brandon Leon", "Realismo mágico ", "Cien años de soledad", 45.0, 1967,
				"Editorial planeta");
		biblioteca.agregarLibro(libro2);
		System.out.println(biblioteca.getLibros());
		System.out.println("Ejercicio 2 \n");
		// biblioteca.prestarLibro(libro2, usuario1);
		System.out.println(usuario1);

		// Invocar 3 libros mas
		Libro libro3 = new Libro(3, "J.K. Rowling", "Novela de fantasia y aventura",
				"Harry Potter y a piedra filosofica", 38.0, 1988, "Bloomsbury");
		biblioteca.agregarLibro(libro3);
		System.out.println(biblioteca.getLibros());
		System.out.println("Ejercicio 3 \n");
		biblioteca.prestarLibro(libro3, usuario1);
		System.out.println(usuario1);

		Libro libro4 = new Libro(4, "Carmen Mola", "Novela negra", "Los huerfanos ", 21.75, 2026, "Editorial Planeta");
		biblioteca.agregarLibro(libro4);
		System.out.println(biblioteca.getLibros());
		System.out.println("Ejercicio 4 \n");
		biblioteca.prestarLibro(libro4, usuario1);
		System.out.println(usuario1);

		Libro libro5 = new Libro(5, "James Clear", "Autoayuda y desarrollo personal", "Habitos atomicos ", 12.60, 2019,
				"Paidos");
		biblioteca.agregarLibro(libro5);
		System.out.println(biblioteca.getLibros());
		System.out.println("Ejercicio 5 \n");
		biblioteca.prestarLibro(libro5, usuario1);
		System.out.println(usuario1);

		// Test buscarPorId
		// Prueba de buscarPorId: el id 10 no existe, debe decir "Libro no encontrado".
		Libro encontrado = biblioteca.buscarPorId(10);
		System.out.println("Ejercicio de buscarPorId \n");
		if (encontrado != null) {
			System.out.println(encontrado.getAutor());
		} else {
			System.out.println("Libro no encontrado");
		}
		// Test buscarPorTitulo
		// Prueba de buscarPortitulo: busca "Caballo de troya"
		Libro libroEncontrado = biblioteca.buscarPortitulo("Caballo de troya");
		System.out.println("Ejercicio de buscarPorTitulo \n");
		if (libroEncontrado != null) {
			System.out.println(libroEncontrado.getTitulo());
		} else {
			System.out.println("Libro no encontrado");
		}
		// test Mostrar libro disponibles
		// Prueba de mostrarLibrosDisponibles.
		System.out.println("Ejercicio de Mostrsr libros disponibles \n");
		biblioteca.mostrarLibrosDisponibles();
		// test probar buscar por autor
		System.out.println("Ejercicio de Mostrsr libros por autor \n");
		biblioteca.buscarPorAutor("James Clear");
		// test precio maximo
		// Prueba de buscarPrecioMaximo: libros de hasta 20.00.
		System.out.println("Ejercicio de Mostrsr precio maximo \n");
		biblioteca.buscarPrecioMaximo(20.00);
		// Test precio minimo
		// Prueba de calcularPrecioMinimo: libros desde 25.0.
		System.out.println("Ejercicio de Mostrsr precio minimo \n");
		biblioteca.calcularPrecioMinimo(25.0);
		

	}

}
