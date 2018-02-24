package com.rances.util;

import java.util.Date;

import com.rances.entity.Cliente;

public class Precios {
	

	
	private static int rentaFamiliar = 30;

	

	public static int getRentaFamiliar() {
		return rentaFamiliar;
	}

	public static void setRentaFamiliar(int rentaFamiliar) {
		Precios.rentaFamiliar = rentaFamiliar;
	}

	
	public Precios(int rentaFamiliar) {
	
		this.rentaFamiliar = rentaFamiliar;		
		
	}
	
	
	

}
