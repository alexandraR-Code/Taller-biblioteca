package com.biblioteca;

//Representa un libro. Biblioteca los guarda en una lista y Usuario guarda los que tiene prestados.
public class Libro {
	// Atributos
	private int id;
	private String autor;
	private String genero;
	private String titulo;
	private double precio;
	private int anio;
	private String isbn;
	private String editorial;
	private boolean prestado; // true = prestado, false = disponible

	// Metodo getter y setter
	// Getter: devuelve el valor de un atributo (isPrestado es el del boolean).
	// Setter: asigna o cambia el valor de un atributo.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	// Constructor vacío: crea el libro sin datos (textos en null, números en 0,
	// prestado en false).
	public Libro() {

	}

	// Constructor con datos: guarda lo recibido. El isbn no se recibe, así que
	// queda en null.
	public Libro(int id, String autor, String genero, String titulo, double precio, int anio, String editorial) {
		this.id = id;
		this.autor = autor;
		this.genero = genero;
		this.titulo = titulo;
		this.precio = precio;
		this.anio = anio;
		this.editorial = editorial;
		this.prestado = false; // No est adentro de los parametros pues ya se le da de manera automatica es
								// estado
	}
	public Libro( String autor, String genero, String titulo, double precio, int anio, String editorial) {
		this.autor = autor;
		this.genero = genero;
		this.titulo = titulo;
		this.precio = precio;
		this.anio = anio;
		this.editorial = editorial;
		this.prestado = false; // No est adentro de los parametros pues ya se le da de manera automatica es
								// estado
	}

	// Marca el libro como prestado. La llama Biblioteca.prestarLibro.
	public void prestar() {
		prestado = true;
	}

	// Marca el libro como disponible. Si no estaba prestado, solo avisa.
	public void devolverLibro() {
		if (prestado == true) { // se iguala al valor que se asigno en el constructor "false"
			prestado = false;
			System.out.println("Libro devuelto");
		} else {
			System.out.println("Libro no se encuentra prestado");
		}
	}

	// Muestra solo el título del libro.
	public void imprimir() {
		System.out.println("Titulo: " + getTitulo());
	}

	// Convierte el libro en texto para imprimirlo con System.out.println(libro).
	@Override
	public String toString() {
		return "Libro=id: " + id + " " + "autor: " + autor + " " + " genero: " + genero + " " + " titulo: " + titulo
				+ " " + " precio: " + precio + "  " + " anio: " + anio + " editorial: " + editorial + " "
				+ " prestado: " + prestado;
	}

}
