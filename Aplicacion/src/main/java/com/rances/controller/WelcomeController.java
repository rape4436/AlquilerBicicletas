package com.mkyong.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mkyong.dao.ICustomerRepository;

@Controller
public class WelcomeController {

	@Autowired
	ICustomerRepository dao;

	String referencia = "10034349500";

	@RequestMapping(value = "/in", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {

		return "index";
	}

	@RequestMapping(value = "/Copia", method = RequestMethod.GET)
	public String Copia(ModelMap model) {

		return "Copia";
	}
	
	@RequestMapping(value = "/ConsultaSaldo", method = RequestMethod.GET)
	public String CosnsultaSaldo(ModelMap model) {

		return "ConsultaSaldo";
	}
	@RequestMapping(value = "/cwelcome", method = RequestMethod.GET)
	public String showWelcomePages() {

		return "cwelcome";
	}

	@RequestMapping(value = "/inicio", method = RequestMethod.GET)
	public String showWelcomePage() {

		return "inicio";
	}
	
	
	/*--------------------*/

	@RequestMapping(value = "/findCustomer")
	public String findCustomer(Map<String, Object> model) {

		dao.findByReferencia(referencia);

		return "welcome";
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
	public String addCustomer() {

		dao.addCustomer(referencia);

		return "addCustomer";
	}

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public String saveCustomer() {

		dao.saveCustomer(referencia);

		return "welcome";
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.POST)
	public String deleteCustomer() {

		dao.deleteCustomer(referencia);

		return "welcome";
	}
}