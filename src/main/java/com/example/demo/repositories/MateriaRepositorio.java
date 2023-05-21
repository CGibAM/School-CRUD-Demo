package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Materia;

public interface MateriaRepositorio extends JpaRepository<Materia, Integer>{
	
}
