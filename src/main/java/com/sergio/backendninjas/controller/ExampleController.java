package com.sergio.backendninjas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sergio.backendninjas.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {

	public static final String VIEW_EXAMPLE = "example";

	// Primera forma
	// su usa mas frecuente para redireccionar o insertar datos en
	// plantillas(muy pocos )
	@GetMapping("/exampleString")
	public String exampleString(Model model) {

		model.addAttribute("nombre", "Sergio");
		model.addAttribute("person", new Person("Sergio", 24));
		model.addAttribute("people", getPeople());

		return VIEW_EXAMPLE;
	}

	// Segunda forma
	// se usa con mas frecuencia para insertar datos en las plantillas

	// @RequestMapping(value="/exampleMAV",method=RequestMethod.GET) - FORMA
	// ANTIGUA
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {

		ModelAndView model = new ModelAndView(VIEW_EXAMPLE);
		model.addObject("nombre", "Edwin");
		model.addObject("person", new Person("Edwin", 27));
		model.addObject("people", getPeople());

		return model;
	}

	private List<Person> getPeople() {

		List<Person> listPeople = new ArrayList<>();

		listPeople.add(new Person("Sergio", 24));
		listPeople.add(new Person("Edwin", 27));
		listPeople.add(new Person("Ana", 29));
		listPeople.add(new Person("Everardo", 53));
		
		return listPeople;

	}

}
