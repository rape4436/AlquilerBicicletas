package com.rances.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rances.entity.Alquiler;
import com.rances.service.IAlquilerRepository;

@Controller
public class ControllerAlquiler {
	

	@Autowired
	IAlquilerRepository dao;

	/**
	 * @param request
	 * @param response
	 * @return
	 * @throws DaoException
	 */
	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response) {
		return "Index";
	}
	
	/**
	 * @param request
	 * @throws DaoException
	 */
	@SuppressWarnings("unused")
	@RequestMapping(value = "/findSolicitudAll", method = RequestMethod.GET)
	public List<Alquiler> findSolicitudAll() {
		
		List<Alquiler> listAlquiler = new ArrayList<Alquiler>();
		
		return listAlquiler = dao.findSolicitudAll();
	}

	/**
	 * @param request
	 * @throws DaoException
	 */
	@RequestMapping(value = "/findSolicitudById", method = RequestMethod.POST)
	public List<Alquiler> findSolicitud(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("Alquiler") Alquiler alquiler,
			BindingResult bindingResult) {
		
		@SuppressWarnings("unused")
		List<Alquiler> listAlquiler = new ArrayList<Alquiler>();
		
		return listAlquiler = dao.findSolicitud(alquiler.getCodAlquiler());
		

	}

	

	/**
	 * @param request
	 * @throws DaoException
	 */
	@RequestMapping(value = "/addSolicitud", method = RequestMethod.POST)
	public Alquiler addSolicitud(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("Alquiler") Alquiler alquiler,
			BindingResult bindingResult) {
		
		try {
			
			

			dao.addSolicitud(alquiler);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return alquiler;
			 
	}

	/**
	 * @param request
	 * @throws DaoException
	 */
	@RequestMapping(value = "/updateSolicitud", method = RequestMethod.POST)
	public Alquiler updateSolicitud(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("Alquiler") Alquiler alquiler,
			BindingResult bindingResult) {

		try {

			dao.updateSolicitud(alquiler);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return alquiler;

	}

	/**
	 * @param request
	 * @throws DaoException
	 */
	@RequestMapping(value = "/deleteSolicitud", method = RequestMethod.POST)
	public Alquiler deleteSolicitud(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("Alquiler") Alquiler alquiler,
			BindingResult bindingResult) {

		try {

			dao.deleteSolicitud(alquiler);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return alquiler;

	}
	
	
	
	
	

}
