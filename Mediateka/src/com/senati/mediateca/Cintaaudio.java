package com.senati.mediateca;

public class Cintaaudio extends Soporte {
	//Atributos clase Cintaaudio
	 String lugar;
	 float duracion;
	 //Constructores llenos
	public Cintaaudio(int id, String titulo, String autor, float precio, String lugar, float duracion) {
		super(id, titulo, autor, precio);
		this.lugar = lugar;
		this.duracion = duracion;
	}
	//Constructores vacios
	public Cintaaudio(int id, String titulo, String autor, float precio) {
		super(id, titulo, autor, precio);
	}
	//Getters y Setters
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	//ToString()
	@Override
	public String toString() {
		return "Cintaaudio [lugar=" + lugar + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
				+ ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	 
	 
}
