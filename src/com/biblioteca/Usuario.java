package com.biblioteca;

public class Usuario {

//------------------------------------

	private String nombre;
	private String apellido;
	private String cedula;
	private int idUsuario;

//---------------------------------------
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

//-----------------------------------------------------------
	// Constructor vacio
	public Usuario() {

	}

//---------------------------------------------------------
	// Constructor inicializado
	public Usuario(String nombre, String apellido, String cedula, int idUsuario) {
		this.nombre = nombre; // "Ana" si se asigna un nombre directamente aqui todos los objetos tendra este
		this.apellido = apellido; // mismo nombre
		this.cedula = cedula;
		this.idUsuario = idUsuario;
	}

//-------------------------------------------------------------
	// Metodo toString
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", idUsuario="
				+ idUsuario + "]";
	}

}
