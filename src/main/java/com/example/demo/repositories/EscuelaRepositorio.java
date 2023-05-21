package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Escuela;

public interface EscuelaRepositorio extends JpaRepository<Escuela, Integer>{
	
}
