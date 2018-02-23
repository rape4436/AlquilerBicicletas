package com.rances.test;

import junit.framework.*;

import com.rances.controller.ControllerAlquiler;
import com.rances.entity.Alquiler;
import com.rances.entity.Cliente;
import com.rances.service.impl.AlquilerRepository;
import com.rances.util.Precios;

public class AlquilerTest extends TestCase {

	protected Double sumatoria = (double) 0;

	java.util.Date fecha;

	AlquilerRepository alquilerRepository = new AlquilerRepository();
	
	

	public void testAddAlquilerPorHora() {

		Alquiler alquiler = new Alquiler(1L, 5, fecha, null, "Prueba por hora",
				"1", 5, 0, new Cliente(1L, "rances", "peñap", 140339668,
						"Honorio", "2674-1046", "rances_daniel@hotmail.com"));

		// llamada al metodo
		alquilerRepository.alquilerPorHora(alquiler);

		// logica del la opereacion
		sumatoria = (alquiler.getTiempo() * Precios.getHora());

		assertTrue(sumatoria == 25);

		alquiler.setTotal(sumatoria * alquiler.getCantidad());

		assertTrue(alquiler.getTotal() == 125);

	}
	
	public void testAddAlquilerPorHoraMetodo() {

		Alquiler alquiler = new Alquiler(1L, 5, fecha, null, "Prueba por hora",
				"1", 5, 0, new Cliente(1L, "rances", "peñap", 140339668,
						"Honorio", "2674-1046", "rances_daniel@hotmail.com"));

		// llamada al metodo
		alquilerRepository.alquilerPorHora(alquiler);


	}

	public void testAddAlquilerPorDia() {

		Alquiler alquiler = new Alquiler(1L, 3, fecha, null, "Prueba por dia",
				"2", 3, 0, new Cliente(1L, "rances", "peña", 140339668,
						"Honorio", "2674-1046", "rances_daniel@hotmail.com"));

		// llamada al metodo
		alquilerRepository.alquilerPorDia(alquiler);

		// logica del la opereacion
		sumatoria = (alquiler.getTiempo() * Precios.getDia());

		assertTrue(sumatoria == 60);

		alquiler.setTotal(sumatoria * alquiler.getCantidad());

		assertTrue(alquiler.getTotal() == 180);

	}
	
	public void testAddAlquilerPorDiaMetodo() {
		
		Alquiler alquiler = new Alquiler(1L, 3, fecha, null, "Prueba por dia",
				"2", 3, 0, new Cliente(1L, "rances", "peña", 140339668,
						"Honorio", "2674-1046", "rances_daniel@hotmail.com"));
		
		// llamada al metodo
		alquilerRepository.alquilerPorDia(alquiler);

	
	}

	public void testAddAlquilerPorSemana() {

		Alquiler alquiler = new Alquiler(1L, 2, fecha, null,
				"Prueba por semana", "3", 2, 0, new Cliente(1L, "rances",
						"peña", 140339668, "Honorio", "2674-1046",
						"rances_daniel@hotmail.com"));

		// llamada al metodo
		alquilerRepository.alquilerPorSemana(alquiler);

		// logica del la opereacion
		sumatoria = (alquiler.getTiempo() * Precios.getSemana());

		assertTrue(sumatoria == 120);

		alquiler.setTotal(sumatoria * alquiler.getCantidad());

		assertTrue(alquiler.getTotal() == 240);

	}
	public void testAddAlquilerPorSemanaMetodo() {

		Alquiler alquiler = new Alquiler(1L, 2, fecha, null,
				"Prueba por semana", "3", 2, 0, new Cliente(1L, "rances",
						"peña", 140339668, "Honorio", "2674-1046",
						"rances_daniel@hotmail.com"));

		// llamada al metodo
		alquilerRepository.alquilerPorSemana(alquiler);
		
		assertNotNull(alquiler);


	}

	public void testAddCalcularPromocion() {

		Alquiler alquiler = new Alquiler(1L, 4, fecha, null,
				"Prueba por semana", "3", 1, 120, new Cliente(1L, "rances",
						"peña", 140339668, "Honorio", "2674-1046",
						"rances_daniel@hotmail.com"));

		

		// logica del la opereacion
		
		alquiler.setTotal(alquiler.getTotal() * Precios.getRentaFamiliar()/100);
		
		
		assertTrue(alquiler.getTotal() == 36);
		
		
	}
	
	public void testAddCalcularPromocionMetodo() {

		Alquiler alquiler = new Alquiler(1L, 4, fecha, null,
				"Prueba por semana", "3", 1, 120, new Cliente(1L, "rances",
						"peña", 140339668, "Honorio", "2674-1046",
						"rances_daniel@hotmail.com"));


		// llamada al metodo
	    alquilerRepository.calcularPromocion(alquiler);
	    
	    assertNotNull(alquiler);

	}
	
	
	
	public void testAddFindSolicitudAll() {


		// llamada al metodo
	    alquilerRepository.findAll();

	}
	
	 public void testAddCalcularOperacion() {

			Alquiler alquiler = new Alquiler(1L, 4, fecha, null,
					"Prueba por semana", "3", 1, 120, new Cliente(1L, "rances",
							"peña", 140339668, "Honorio", "2674-1046",
							"rances_daniel@hotmail.com"));
		 
		 alquilerRepository.calcularOperacion(alquiler);
		 
		 assertNotNull(alquiler);
		 
	 }
	 
	 
	 public void testAddAlquilerClase() {

			Alquiler alquiler = new Alquiler(1L, 5, fecha, null, "Prueba por hora",
					"1", 5, 0, new Cliente(1L, "rances", "peñap", 140339668,
							"Honorio", "2674-1046", "rances_daniel@hotmail.com"));
			
			assertEquals(alquiler.getCantidad(),5);
			assertEquals(alquiler.getObservaciones(),"Prueba por hora");
			assertEquals(alquiler.getCodTipoAlquiler(),"1");
			assertEquals(alquiler.getTiempo(),5);
		}

}
