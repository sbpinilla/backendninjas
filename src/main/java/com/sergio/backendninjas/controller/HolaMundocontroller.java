package com.sergio.backendninjas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/say")
public class HolaMundocontroller {

	@GetMapping("/holaMundo")
	public String holaMundo(){
		
		return "holaMundo";
		
	}
	
}
