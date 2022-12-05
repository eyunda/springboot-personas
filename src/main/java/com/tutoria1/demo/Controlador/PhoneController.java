package com.tutoria1.demo.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tutoria1.demo.Modelo.Phone;

import com.tutoria1.demo.Servicios.PhoneService;

@RestController
@RequestMapping ("/phone")
@CrossOrigin("*")
public class PhoneController {
	@Autowired
	private PhoneService phoneService;
	
	@GetMapping
	private ResponseEntity<List<Phone>> getAllPaises (){
		return ResponseEntity.ok(phoneService.findAll());
	}
}
