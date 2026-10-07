package com.biblioteca.main;

import com.biblioteca.Libro;
import com.biblioteca.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro = new Libro();
		libro.autor = "J.J. Benitez";
		libro.titulo = "Caballo de troya";
		libro.anio = 2010;

		System.out.println(libro.autor + " " + libro.titulo + " " + libro.anio);

		Usuario usuario = new Usuario();
		usuario.nombre = "Carolina";
		usuario.apellido = "Ramirez";
		usuario.cedula = "1048850135";
		usuario.idUsuario = 2525;

		System.out.println(usuario.nombre + " " + usuario.apellido + " " + usuario.cedula + " " + usuario.idUsuario);

	}

}
