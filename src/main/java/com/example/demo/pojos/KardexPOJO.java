package com.example.demo.pojos;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class KardexPOJO {
	@Id
	@Basic(optional=false)
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private int materia;
	
	@Column
	private int usuario;
	
	@Basic(optional=false)
	@Column
	private double calificacion;

	public KardexPOJO() {
	}

	public int getId() {
		return id;
	}

	public int getMateria() {
		return materia;
	}

	public int getUsuario() {
		return usuario;
	}

	public double getCalificacion() {
		return calificacion;
	}
	
}
