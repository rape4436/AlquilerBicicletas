package com.rances.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "PROMOCION_ALQUILER")
public class PromocionAlquiler {

	@Id
	@Column(name = "COD_PROMOCION_ALQUILER")
	private Long codPromocionAlquiler;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@ManyToMany
	@JoinColumn(name="COD_ALQUILER")
	private List<Alquiler> alquiler;
	
	
	public PromocionAlquiler() {
	}

	public Long getCcdPromocionAlquiler() {
		return codPromocionAlquiler;
	}

	public void codPromocionAlquiler(Long codPromocionAlquiler) {
		this.codPromocionAlquiler = codPromocionAlquiler;
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