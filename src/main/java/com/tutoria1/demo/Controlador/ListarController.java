package com.tutoria1.demo.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutoria1.demo.Modelo.Usuario;
import com.tutoria1.demo.Servicios.ListarPersonaService;

@RestController
@RequestMapping("/listar")
public class ListarController {
	
	@Autowired
	private ListarPersonaService service;
	
	@GetMapping
	public List<Usuario> listar(){
		return service.listar();
	}

}
