package com.rances.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "TIEMPO_ALQUILER")
public class TiempoAlquiler {

	@Column(name = "COD_TIEMPO_ALQUILER")
	private Long codTiempoAlquiler;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="COD_ALQUILER")
	private List<Alquiler> alquiler;
	
	
	public TiempoAlquiler() {
	}

	public Long getCodTiempoAlquiler() {
		return codTiempoAlquiler;
	}

	public void setCodTiempoAlquiler(Long codTiempoAlquiler) {
		this.codTiempoAlquiler = codTiempoAlquiler;
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