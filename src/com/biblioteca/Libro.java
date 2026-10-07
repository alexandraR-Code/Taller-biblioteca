package com.biblioteca;

public class Libro {
//---Atributos------------------------------------------

	private String autor;
	private String genero;
	private String titulo;
	private double precio;
	private int anio;
	private String editorial;
	private boolean prestado;

//---Metodo getter y setter-------------------------------
	// Getterr: metodo de ACCESO que devuelve un valor
	// setteer: metodo de MODIFICACION, permite asignar o cambiar un valor
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

//---------------------------------------------------------
	// Coonstructor Inicializado
	public Libro(String autor, String genero, String titulo, double precio, int anio, String editorial) {
		this.autor = autor;
		this.genero = genero;
		this.titulo = titulo;
		this.precio = precio;
		this.anio = anio;
		this.editorial = editorial;
		this.prestado = false; // No est adentro de los parametros pues ya se le da de manera automatica es
								// estado
	}

//------------------------------------------------------------
	// constructor vacio
	public Libro() {

	}

//--------------------------------------------------------------
	// Metodo prestar
	public void prestar() {
		prestado = true;
	}

//-------------------------------------------------------------
	// Metodo devolver libro
	public void devolverLibro() {
		if (prestado == true) { // se iguala al valor que se asigno en el constructor "false"
			prestado = false;
			System.out.println("Libro devuelto");
		} else {
			System.out.println("Libro no se encuentra prestado");
		}
	}

//---------------------------------------------------------------------------
	// Metodo Imprimir
	public void imprimir() {
		System.out.println("Titulo: " + getTitulo());
	}
//-------------------------------------------------------------
	// Metodo toString es una funcion incorporada que devuelve una representacion en
	// forma de texto (Cadeena de caracteres o String)

	@Override
	public String toString() {
		return "Libro=" + " " + "autor: " + " " + autor + " " + " genero: " + " " + genero + " " + " titulo: " + " "
				+ titulo + " " + " precio: " + " " + precio + "  " + " anio: " + " " + anio + " editorial: " + " "
				+ editorial + " " + " prestado: " + prestado;
	}

//------------------------------------------------------------------

}
