package com.biblioteca;

import java.util.ArrayList;

public class Usuario {

	// Atributos

	private String nombre;
	private String apellido;
	private String cedula;
	private int idUsuario;
	private ArrayList<Libro> librosPrestados;

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

	public ArrayList<Libro> getLibrosPrestados() {
		return librosPrestados;
	}

	// Constructor vacio
	public Usuario() {
		this.librosPrestados = new ArrayList<Libro>();

	}

	// Constructor inicializado
	public Usuario(String nombre, String apellido, String cedula, int idUsuario) {
		this.nombre = nombre; // "Ana" si se asigna un nombre directamente aqui todos los objetos tendra este
		this.apellido = apellido; // mismo nombre
		this.cedula = cedula;
		this.idUsuario = idUsuario;
		this.librosPrestados = new ArrayList<Libro>();
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", idUsuario="
				+ idUsuario + ", \n librosPrestados=" + librosPrestados + "]";
	}

	// Metodo saludar
	public void saludar() {
		System.out.println("Hola " + getNombre());
	}

	// Tomar libro
	public void tomarLibro(Libro libro) {
		librosPrestados.add(libro);
	}

	// devolver libro
	public void devolverLibro(Libro libro) {
		librosPrestados.remove(libro);
	}
}
