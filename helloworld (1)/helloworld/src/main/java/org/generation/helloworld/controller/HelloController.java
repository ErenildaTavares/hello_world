package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// indica que o codigo abaixo vai ser controller
@RestController 

// indica o endpoint da nossa classe controladora
@RequestMapping ("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello World!";
		
	}
	//subrota
	// O segundo endpoint deverá exibir a lista de BSM’s da Generation Brasil.
	
	@GetMapping("/bsm")
	public String bsm() {
		return "BSMs da Generation Brasil:\n\n"
				+ "Mentalidade de crescimento \r\n"
				+ "Persistência \r\n"
				+ "Responsabilidade pessoal \r\n"
				+ "Orientação ao futuro \r\n"
				+ "Orientação ao detalhe \r\n"
				+ "Comunicação \r\n"
				+ "Proatividade \r\n"
				+ "Trabalho em equipe";
		
	}
	
	//O terceiro endpoint deverá exibir uma lista contendo os seus objetivos de aprendizagem desta semana.
	@GetMapping("bsmObjetivo")
	public String bsmObjetivo() {
		return "Objetivos de aprendizagem desta semana: \n\n"
				+ "Orientação ao detalhe\n"
				+"Responsabilidade pessoal\n"
				+"Tabalho em equipe";
		
	}
}
