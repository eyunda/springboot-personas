package com.tutoria1.demo.Repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoria1.demo.Modelo.Usuario;

public interface ListarPersonaRepository extends JpaRepository<Usuario, Integer>{

}
