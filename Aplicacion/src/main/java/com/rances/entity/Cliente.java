package com.rances.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	
	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	private String telefonoUno;
	private String telefonoDos;
	private String celular;
	private String email;
	
	
	
	public Cliente(){
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





	public String getTelefonoUno() {
		return telefonoUno;
	}





	public void setTelefonoUno(String telefonoUno) {
		this.telefonoUno = telefonoUno;
	}





	public String getTelefonoDos() {
		return telefonoDos;
	}





	public void setTelefonoDos(String telefonoDos) {
		this.telefonoDos = telefonoDos;
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



	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido
				+ ", dni=" + dni + ", direccion="
				+ direccion + ", telefonoUno=" + telefonoUno + ", telefonoDos=" + telefonoDos
				+ ", telefonoUno=" + telefonoUno + ", telefonoDos="
				+ telefonoDos + ", celular=" + celular + ", email=" + email + "]";
	}


	
}
