package com.sergio.backendninjas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller()
@RequestMapping("/example2")
public class Example2Controller {

	
	public static final String VIEW_EXAMPLE2="example2";
	
	
	//Formas de recibir parametros
	// 1)
		//localhost:8080/example2/request1?nm=sergio
		//localhost:8080/example2/request1?nm=Edwin
	
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm",required=false,defaultValue="Sin Parametro !!!")String name){
		

		ModelAndView model = new ModelAndView(VIEW_EXAMPLE2);
		
		model.addObject("nombre", name);
		return model;
		
	}
	
	//2)
		//localhost:8080/example2/request2/jonh
		//localhost:8080/example2/request2/sergio
	
	@GetMapping({"/request2/{nm}","/request2"})
	
	public ModelAndView request2(@PathVariable(name="nm",required=false) String name){
		

		ModelAndView model = new ModelAndView(VIEW_EXAMPLE2);
		
		model.addObject("nombre", name);
		return model;
		
	}
	
}
