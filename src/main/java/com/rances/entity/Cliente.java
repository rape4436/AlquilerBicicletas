package com.rances.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	@Id
	@Column(name = "COD_CLIENTE")
	private Long codCliente;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APWELLIDO")
	private String apellido;
	
	@Column(name = "DNI")
	private int dni;
	
	@Column(name = "DIRECCION")
	private String direccion;
	
	@Column(name = "CELULAR")
	private String celular;
	
	@Column(name = "EMAIL")
	private String email;
	
	
	
	
	
	public Cliente(Long codCliente, String nombre, String apellido, int dni,
			String direccion, String celular, String email) {
		super();
		this.codCliente = codCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.celular = celular;
		this.email = email;
	}


	
	public Cliente() {
		super();
	}





	public Long getCodCliente() {
		return codCliente;
	}


	public void setCodCliente(Long codCliente) {
		this.codCliente = codCliente;
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


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
}
