package com.rances.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "COBRO_ALQUILER")
public class CobroAlquiler {

	@Column(name = "COD_COBRO_ALQUILER")
	private Long codCobroAlquiler;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="COD_ALQUILER")
	private List<Alquiler> alquiler;
	
	
	public CobroAlquiler() {
	}

	public Long getCodCobroAlquiler() {
		return codCobroAlquiler  ;
	}

	public void setCodEstatusAlquiler(Long codCobroAlquiler) {
		this.codCobroAlquiler = codCobroAlquiler;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alquiler> getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(List<Alquiler> alquiler) {
		this.alquiler = alquiler;
	}

	
}