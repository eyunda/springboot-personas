package com.tutoria1.demo.Servicios.Implementos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutoria1.demo.Modelo.Usuario;
import com.tutoria1.demo.Repositorio.ListarPersonaRepository;
import com.tutoria1.demo.Servicios.ListarPersonaService;

@Service
public class ListarPersonaServiceImpl implements ListarPersonaService{

	@Autowired
	ListarPersonaRepository repo;
	
	@Override
	public List<Usuario> listar() {
		return repo.findAll();
	}

	@Override
	public Usuario registar(Usuario usuario) {
		// TODO Auto-generated method stub
		return repo.save(usuario);
	}

	@Override
	public Usuario actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		return repo.save(usuario);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Usuario ListarPorId(Integer codigo) {
		// TODO Auto-generated method stub
		return repo.findById(codigo).orElse(null);
	}
	

}
