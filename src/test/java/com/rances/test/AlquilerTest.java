package com.rances.test;

import java.util.Date;

import junit.framework.*;

import com.rances.entity.Alquiler;
import com.rances.entity.Cliente;
import com.rances.service.impl.AlquilerRepository;

public class AlquilerTest extends TestCase {

	protected Double sumatoria = (double) 0;

	

	AlquilerRepository alquilerRepository = new AlquilerRepository();
	
	
	public void testAddCalculo() {
		
		
		Cliente cliente1 = new Cliente(1L, "rances", "peña", 140339668,"Honorio", "1681-3438", "rances_daniel@gmail.com");
		Cliente cliente2 = new Cliente(2L, "rances", "peña", 201167525,"Honorio", "1756-3438", "ra@gmail.com");
		Cliente cliente3 = new Cliente(3L, "rances", "peña", 196651666,"Honorio", "1756-3438", "ranc@gmail.com");
		Cliente cliente4 = new Cliente(4L, "rances", "peña", 465464564,"Honorio", "1756-3438", "rances@gmail.com");
		
		Alquiler alquiler1 = new Alquiler(1L, new Date(), new Date(), "Prueba por hora","HORA", 5, cliente1);
		Alquiler alquiler2 = new Alquiler(2L, new Date(), new Date(), "Prueba por hora","DIA", 2, cliente1);
		Alquiler alquiler3 = new Alquiler(3L, new Date(), new Date(), "Prueba por hora","SEMANA", 2, cliente1);
		Alquiler alquiler4 = new Alquiler(4L, new Date(), new Date(), "Prueba por hora","HORA", 8, cliente1);
		Alquiler alquiler5 = new Alquiler(5L, new Date(), new Date(), "Prueba por hora","DIA", 3, cliente3);
		Alquiler alquiler6 = new Alquiler(6L, new Date(), new Date(), "Prueba por hora","SEMANA", 1, cliente2);
		Alquiler alquiler7 = new Alquiler(7L, new Date(), new Date(), "Prueba por hora","HORA", 6, cliente4);
		Alquiler alquiler8 = new Alquiler(8L, new Date(), new Date(), "Prueba por hora","DIA", 4, cliente3);
		Alquiler alquiler9 = new Alquiler(9L, new Date(), new Date(), "Prueba por hora","SEMANA", 2, cliente2);
		Alquiler alquiler10 = new Alquiler(10L, new Date(), new Date(), "Prueba por hora","HORA", 7, cliente4);
		
		
		
		alquilerRepository.setAlquileres(alquiler1);
		alquilerRepository.setAlquileres(alquiler2);
		alquilerRepository.setAlquileres(alquiler3);
		alquilerRepository.setAlquileres(alquiler4);
		alquilerRepository.setAlquileres(alquiler5);
		alquilerRepository.setAlquileres(alquiler6);
		alquilerRepository.setAlquileres(alquiler7);
		alquilerRepository.setAlquileres(alquiler8);
		alquilerRepository.setAlquileres(alquiler9);
		alquilerRepository.setAlquileres(alquiler10);
		
	}
	

	
	public void testAddFindSolicitudAll() {

		// llamada al metodo
	    alquilerRepository.findAll();

	}
	
	 
	 

}
