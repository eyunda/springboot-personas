package com.tutoria1.demo.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutoria1.demo.Repositorio.PhoneRepository;
import com.tutoria1.demo.Modelo.Phone;

@Service
public class PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;
	
	public List<Phone> findAll(){
		return phoneRepository.findAll();
	}
}
