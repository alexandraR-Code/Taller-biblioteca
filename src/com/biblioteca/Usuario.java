package com.biblioteca;

import java.util.ArrayList;

//Persona que usa la biblioteca: guarda sus datos y la lista de libros que tiene prestados
public class Usuario {

	// Atributos

	private String nombre;
	private String apellido;
	private String cedula;
	private int idUsuario;
	private ArrayList<Libro> librosPrestados; // Se crea en los constructores para evitar NullPointerException

	// Metodos getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	// Biblioteca lo usa para contar cuántos libros tiene el usuario (máximo 3)
	public ArrayList<Libro> getLibrosPrestados() {
		return librosPrestados;
	}

	// Constructor vacío: datos sin llenar y lista de libros vacía.
	public Usuario() {
		this.librosPrestados = new ArrayList<Libro>();

	}

	// Constructor con datos: guarda los datos recibidos y crea la lista de libros
	// vacía.
	public Usuario(String nombre, String apellido, String cedula, int idUsuario) {
		this.nombre = nombre; // "Ana" si se asigna un nombre directamente aqui todos los objetos tendra este
		this.apellido = apellido; // mismo nombre
		this.cedula = cedula;
		this.idUsuario = idUsuario;
		this.librosPrestados = new ArrayList<Libro>();
	}

	// Muestra los datos del usuario y los libros que tiene prestados
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", idUsuario="
				+ idUsuario + ", \n librosPrestados=" + librosPrestados + "]";
	}

	// Imprime un saludo con el nombre del usuario.
	public void saludar() {
		System.out.println("Hola " + getNombre());
	}

	// Agrega un libro a la lista del usuario. La llama Biblioteca.prestarLibro.
	public void tomarLibro(Libro libro) {
		librosPrestados.add(libro);
	}

	// Quita el libro de la lista del usuario (no cambia el estado "prestado" del
	// libro).
	public void devolverLibro(Libro libro) {
		librosPrestados.remove(libro);
	}
}
