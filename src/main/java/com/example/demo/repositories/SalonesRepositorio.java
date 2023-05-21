package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Salones;

public interface SalonesRepositorio extends JpaRepository<Salones, Integer>{
	
}
