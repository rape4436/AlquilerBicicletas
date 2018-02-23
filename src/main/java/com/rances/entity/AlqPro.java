package com.rances.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ALQ_PRO")
public class AlqPro {

	@Id
	@Column(name = "COD_ALQ")
	private Long codAlq;

	@Id
	@Column(name = "COD_PRO")
	private Long codPro;

	public Long getCodAlq() {
		return codAlq;
	}

	public void setCodAlq(Long codAlq) {
		this.codAlq = codAlq;
	}

	public Long getCodPro() {
		return codPro;
	}

	public void setCodPro(Long codPro) {
		this.codPro = codPro;
	}
	

	
	
	

	
}