package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Usuarios;

public interface UsuarioRepositorio extends JpaRepository<Usuarios, Integer>{
	
}
