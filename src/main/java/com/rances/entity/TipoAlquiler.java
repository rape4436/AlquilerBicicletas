package com.rances.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "TIPO_ALQUILER")
public class TipoAlquiler {

	@Column(name = "COD_TIPO_ALQUILER")
	private Long codEstatusAlquiler;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="COD_ALQUILER")
	private List<Alquiler> alquiler;
	
	
	public TipoAlquiler() {
	}


	public Long getCodEstatusAlquiler() {
		return codEstatusAlquiler;
	}


	public void setCodEstatusAlquiler(Long codEstatusAlquiler) {
		this.codEstatusAlquiler = codEstatusAlquiler;
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