package com.tutoria1.demo.Servicios;

import com.tutoria1.demo.Modelo.Usuario;
import com.tutoria1.demo.Modelo.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
    
    Set<Usuario> obtenerUsuarios();
    
    Usuario actualizarPersona(Usuario usuario);
    
    Usuario obteneruser(Long userId);
    
    

	
}