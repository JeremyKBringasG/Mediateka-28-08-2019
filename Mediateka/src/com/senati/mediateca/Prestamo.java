package com.senati.mediateca;

public class Prestamo {
	 //Atributos
	int cantidad;
	int idsoporte;
	int idprestamo;
	int idsocio;
	float monto;
	//Constructores llenos
	public Prestamo(int cantidad, int idsoporte, int idprestamo, int idsocio, float monto) {
		super();
		this.cantidad = cantidad;
		this.idsoporte = idsoporte;
		this.idprestamo = idprestamo;
		this.idsocio = idsocio;
		this.monto = monto;
	}
	//Constructores vacios
	public Prestamo() {
		super();
	}
	//Getters y Setters
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdsoporte() {
		return idsoporte;
	}
	public void setIdsoporte(int idsoporte) {
		this.idsoporte = idsoporte;
	}
	public int getIdprestamo() {
		return idprestamo;
	}
	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}
	public int getIdsocio() {
		return idsocio;
	}
	public void setIdsocio(int idsocio) {
		this.idsocio = idsocio;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	//ToString()
	@Override
	public String toString() {
		return "Prestamo [cantidad=" + cantidad + ", idsoporte=" + idsoporte + ", idprestamo=" + idprestamo
				+ ", idsocio=" + idsocio + ", monto=" + monto + "]";
	}
	
	
}
