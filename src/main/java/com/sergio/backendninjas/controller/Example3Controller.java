package com.sergio.backendninjas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.sergio.backendninjas.model.Person;

@Controller
@RequestMapping("/example3")
public class Example3Controller {

	public static final String VIEW_EXAMPLE3 = "example3";
	public static final String VIEW_RESULT = "result";

	//redireccionar
	
	//(1)
	/*
	@GetMapping("/")
	public String redirect(){
		
		return "redirect:/example3/showform";
	}*/
	//(2)
	@GetMapping("/")
	public RedirectView redirect(){
		
		return new RedirectView("/example3/showform");
	}
	
	
	@GetMapping("/showform2")
	public String showForm2(Model model) {

		int a=6/0;
		
		return VIEW_EXAMPLE3;
	}
	
	@GetMapping("/showform")
	public String showForm(Model model) {

		model.addAttribute("person", new Person());

		return VIEW_EXAMPLE3;
	}
	
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("person") Person p ){
		
		ModelAndView model = new ModelAndView(VIEW_RESULT);
		model.addObject("person",p);
		return model;
	}

}
