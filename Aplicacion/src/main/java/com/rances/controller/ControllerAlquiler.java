package com.rances.controller;


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
	@RequestMapping(value = "/findSolicitudAll", method = RequestMethod.GET)
	public String findSolicitudAll(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("Alquiler") Alquiler alquiler,
			BindingResult bindingResult) {

		
		try {
			
			alquiler = dao.findSolicitudAll();

		} catch (Exception e) {

			System.out.println("Error: " + e.getMessage());
		}

		return "Alquiler";

	}

	/**
	 * @param request
	 * @throws DaoException
	 */
	@RequestMapping(value = "/findSolicitudById", method = RequestMethod.POST)
	public String findSolicitud(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("Alquiler") Alquiler alquiler,
			BindingResult bindingResult) {

		try {

			alquiler = dao.findSolicitud(alquiler.getCodAlquiler());

		} catch (Exception e) {

			System.out.println("Error: " + e.getMessage());
		}

		return "Alquiler";

	}

	

	/**
	 * @param request
	 * @throws DaoException
	 */
	@RequestMapping(value = "/addSolicitud", method = RequestMethod.POST)
	public String addSolicitud(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("Alquiler") Alquiler alquiler,
			BindingResult bindingResult) {

		try {

			 dao.addSolicitud(alquiler);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return "addExito";

	}

	/**
	 * @param request
	 * @throws DaoException
	 */
	@RequestMapping(value = "/updateSolicitud", method = RequestMethod.POST)
	public String updateSolicitud(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("Alquiler") Alquiler alquiler,
			BindingResult bindingResult) {

		try {

			dao.updateSolicitud(alquiler);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return "updateExito";

	}

	/**
	 * @param request
	 * @throws DaoException
	 */
	@RequestMapping(value = "/deleteSolicitud", method = RequestMethod.POST)
	public String deleteSolicitud(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("Alquiler") Alquiler alquiler,
			BindingResult bindingResult) {

		try {

			dao.deleteSolicitud(alquiler);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return "deleteExito";

	}

}
