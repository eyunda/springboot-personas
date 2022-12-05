package com.tutoria1.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tutoria1.demo.Modelo.Persona;



@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}