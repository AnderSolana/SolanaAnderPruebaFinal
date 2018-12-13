package com.ipartek.formacion.pojos;

import java.util.Date;

public class Noticia {
	
	private Long id;
	private String titulo, autor, texto, imagen;
	private Date fecha; 
	
		
	
	public Noticia(Long id, String titulo, String autor, String texto, String imagen, Date fecha) {
		setId(id);
		setTitulo(titulo);
		setAutor(autor);
		setTexto(texto);
		setImagen(imagen);
		setFecha(fecha);
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = "https://picsum.photos/200/300/?random";
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	} 
		

}
