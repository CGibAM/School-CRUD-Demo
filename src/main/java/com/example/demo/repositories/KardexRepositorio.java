package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Kardex;

public interface KardexRepositorio extends JpaRepository<Kardex, Integer>{
	
}
