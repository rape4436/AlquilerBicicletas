package com.rances.entity;

import javax.persistence.*;


@Entity
@Table(name = "BICICLETA")
public class Bicicleta {

	@Id
	@Column(name = "COD_BICICLETA")
	private Long codBicicleta;

	@Column(name = "MARCA")
	private String marca;

	@Column(name = "COLOR")
	private String color;

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

	public Alquiler getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}

	

	

}