package com.kzn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kzn.shoppingbackend.dao.CategoryDAO;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "Home");
			mv.addObject("userclickhome", true);
			mv.addObject("categories", categoryDAO.list());
			return mv;
	}
	@RequestMapping(value = {"/about"})
	public ModelAndView about() {
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "About us");
			mv.addObject("userclickabout", true);
			return mv;
	}
	
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact() {
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title", "Contact");
			mv.addObject("userclickcontact", true);
			return mv;
	}
	
	
	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
		if(greeting ==null) {
			greeting = "Default Message";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test1(@PathVariable(value="greeting") String greeting) {
		if(greeting ==null) {
			greeting = "Default Message";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}

}
