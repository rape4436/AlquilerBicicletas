package com.rances.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "ESTATUS_ALQUILER")
public class EstatusAlquiler {

	@Column(name = "COD_ESTATUS_ALQUILER")
	private Long codEstatusAlquiler;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="COD_ALQUILER")
	private List<Alquiler> alquiler;
	
	
	public EstatusAlquiler() {
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