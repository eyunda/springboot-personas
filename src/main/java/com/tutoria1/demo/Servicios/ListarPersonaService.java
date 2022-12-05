package com.tutoria1.demo.Servicios;

import java.util.List;

import com.tutoria1.demo.Modelo.Usuario;

public interface ListarPersonaService {
	
	List<Usuario> listar();
	Usuario registar (Usuario usuario);
	Usuario actualizar (Usuario usuario);
	void eliminar(Integer codigo);
	Usuario ListarPorId(Integer codigo);

}
