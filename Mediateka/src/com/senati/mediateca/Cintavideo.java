package com.senati.mediateca;

public class Cintavideo extends Soporte{
	//Atributos Cintavideo
	String actores;
	float duracion;
	//Constructores llenos
	public Cintavideo(int id, String titulo, String autor, float precio, String actores, float duracion) {
		super(id, titulo, autor, precio);
		this.actores = actores;
		this.duracion = duracion;
	}
	//Constructores vacios
	public Cintavideo(int id, String titulo, String autor, float precio) {
		super(id, titulo, autor, precio);
	}
	//Getters y Setters
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	//ToString
	@Override
	public String toString() {
		return "Cintavideo [actores=" + actores + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
				+ ", autor=" + autor + ", precio=" + precio + "]";
	}
	
}
