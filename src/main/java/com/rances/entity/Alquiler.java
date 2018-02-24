package com.rances.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "ALQUILER")
public class Alquiler {
    

	@Id
	@Column(name = "COD_ALQUILER")
	private Long codAlquiler;

	@Column(name = "FEC_ALTA")
	private Date fecAlta;

	@Column(name = "FEC_BAJA")
	private Date fecBaja;

	@Column(name = "OBSERVACIONES")
    String observaciones;
	
	@OneToMany(mappedBy="alquiler")
	private String codTipoAlquiler;
	
	@Column(name = "TIEMPO")
	private int tiempo;
	
	@Column(name = "TOTAL")
	private double total;
	
	@ManyToOne
	@JoinColumn(name="COD_CLIENTE")
	private Cliente cliente;
	
	
	
	
	public Alquiler(Long codAlquiler, Date fecAlta, Date fecBaja,
			String observaciones, String codTipoAlquiler, int tiempo, Cliente cliente) {
	
		this.codAlquiler = codAlquiler;
		this.fecAlta = fecAlta;
		this.fecBaja = fecBaja;
		this.observaciones = observaciones;
		this.codTipoAlquiler = codTipoAlquiler;
		this.tiempo = tiempo;
		this.cliente = cliente;
		
	
	}
    

	public Long getCodAlquiler() {
		return codAlquiler;
	}




	public void setCodAlquiler(Long codAlquiler) {
		this.codAlquiler = codAlquiler;
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


	public Cliente getCliente() {
		return cliente;
	}




	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public int getTiempo() {
		return tiempo;
	}




	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}



	public double getTotal() {
		return total;
	}




	public void setTotal(double total) {
		this.total = total;
	}




	public String getCodTipoAlquiler() {
		return codTipoAlquiler;
	}




	public void setCodTipoAlquiler(String codTipoAlquiler) {
		this.codTipoAlquiler = codTipoAlquiler;
	}



  
}
