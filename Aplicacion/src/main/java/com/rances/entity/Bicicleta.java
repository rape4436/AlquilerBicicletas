package com.rances.entity;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "BICICLETA")
public class Bicicleta {

	@Column(name = "COD_BICICLETA")
	private Long codBicicleta;

	@Column(name = "MARCA")
	private String marca;

	@Column(name = "COLOR")
	private String color;
	
	@Column(name = "VELOCIDAD_MAXIMA")
	private int velocidadMaxima;
	
	@Column(name = "VELOCIDAD_ACTUAL")
	private int velocidadActual;
	
	@Column(name = "ESTATUS")
	private String estatus;

	@Column(name = "FEC_DEVOLUCION")
	private Date fecDevolucion;
	
	@ManyToOne
	@JoinColumn(name="COD_ALQUILER")
	private Alquiler alquiler;

	public Long getCodBicicleta() {
		return codBicicleta;
	}

	public void setCodBicicleta(Long codBicicleta) {
		this.codBicicleta = codBicicleta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFecDevolucion() {
		return fecDevolucion;
	}

	public void setFecDevolucion(Date fecDevolucion) {
		this.fecDevolucion = fecDevolucion;
	}

	public Alquiler getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}
	
	

	
	
	
	
	
	

}