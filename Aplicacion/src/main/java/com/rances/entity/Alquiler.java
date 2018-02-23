package com.rances.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "ALQUILER")
public class Alquiler {
    

	@Column(name = "COD_ALQUILER")
	private Long codAlquiler;

	@Column(name = "AFILIADO")
	private String afiliado;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO")
	private String apellido;
	
	@Column(name = "DNI")
	private String dni;
	
	@Column(name = "FEC_ALTA")
	private Date fecAlta;

	@Column(name = "FEC_BAJA")
	private Date fecBaja;


	@Column(name = "OBSERVACIONES")
    String observaciones;
	
	@ManyToOne
	@JoinColumn(name="COD_TIEMPO")
	private TiempoAlquiler tiempoAlquiler;
	
	@ManyToOne
	@JoinColumn(name="COD_COBRO")
	private CobroAlquiler cobroAlquiler;
	
	@ManyToOne
	@JoinColumn(name="COD_PROMOCION")
	private PromocionAlquiler promocionAlquiler;
	
	@ManyToOne
	@JoinColumn(name="COD_ESTATUS_ALQUILER")
	private EstatusAlquiler estatusAlquiler;
	
	
	public Long getCodAlquiler() {
		return codAlquiler;
	}




	public void setCodAlquiler(Long codAlquiler) {
		this.codAlquiler = codAlquiler;
	}




	public String getAfiliado() {
		return afiliado;
	}




	public void setAfiliado(String afiliado) {
		this.afiliado = afiliado;
	}




	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public Date getFecAlta() {
		return fecAlta;
	}




	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}




	public Date getFecBaja() {
		return fecBaja;
	}




	public void setFecBaja(Date fecBaja) {
		this.fecBaja = fecBaja;
	}



	public String getObservaciones() {
		return observaciones;
	}




	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}




	public TiempoAlquiler getTiempoAlquiler() {
		return tiempoAlquiler;
	}




	public void setTiempoAlquiler(TiempoAlquiler tiempoAlquiler) {
		this.tiempoAlquiler = tiempoAlquiler;
	}




	public CobroAlquiler getCobroAlquiler() {
		return cobroAlquiler;
	}




	public void setCobroAlquiler(CobroAlquiler cobroAlquiler) {
		this.cobroAlquiler = cobroAlquiler;
	}




	public PromocionAlquiler getPromocionAlquiler() {
		return promocionAlquiler;
	}




	public void setPromocionAlquiler(PromocionAlquiler promocionAlquiler) {
		this.promocionAlquiler = promocionAlquiler;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public EstatusAlquiler getEstatusAlquiler() {
		return estatusAlquiler;
	}




	public void setEstatusAlquiler(EstatusAlquiler estatusAlquiler) {
		this.estatusAlquiler = estatusAlquiler;
	}




	

  
}
