package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Horario;

public interface HorarioRepositorio extends JpaRepository<Horario, Integer>{
	
}
