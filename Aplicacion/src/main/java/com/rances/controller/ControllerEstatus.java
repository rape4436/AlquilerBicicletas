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

import com.rances.entity.EstatusAlquiler;
import com.rances.service.IEstatusAlquilerRepository;



@Controller
public class ControllerEstatus {
	
	@Autowired
	IEstatusAlquilerRepository dao;
	


	/**
	 * @param request
	 * @throws DaoException
	 */
	@RequestMapping(value = "/updateEstatus", method = RequestMethod.POST)
	public String updateEstatus(
			HttpServletRequest request,
			HttpServletResponse response,
			Model model,
			@ModelAttribute("EstatusAlquiler") EstatusAlquiler estatusAlquiler,
			BindingResult bindingResult) {
		
		try {
			
		    dao.updateEstatus(estatusAlquiler);

			
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		
		
		return "Alquiler";

	}

	
	
	
		
}
