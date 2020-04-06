package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;
//Usuario:Lorenzo Contrasena:1234


@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "login";
	}
	
	@PostMapping("/validacion")
	public String procesarVForm(Usuario usuario) {
		
		if(usuario.getUser().equals("Lorenzo") && usuario.getPass().equals("1234")) {
			return "mostrarMensajeV";
		}
		return "mostrarMensajeF";
	}
}
