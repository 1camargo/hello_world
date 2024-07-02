package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String listaBSMs() {
		return "Orientação ao futuro \nPersistência \nResponsabilidade pessoal \nOrientação ao detalhe \nTrabalho em equipe \nProatividade \nComunicação \nMentalidade de crescimento";
	}
	
	@GetMapping("/objetivos")
	public String listaObjetivos() {
		return "Primeiros passos com Spring Boot \nSessão de Mentoria \nSessão de Empregabilidade";
	}
 }