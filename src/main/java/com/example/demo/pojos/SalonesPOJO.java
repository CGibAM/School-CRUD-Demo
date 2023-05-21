package com.example.demo.pojos;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class SalonesPOJO {
	@Id
	@Basic (optional = false)
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private int materia;
	
	@Basic (optional = false)
	@Column
	private boolean activo;
	
	
	public SalonesPOJO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMateria() {
		return materia;
	}

	public void setMateria(int materia) {
		this.materia = materia;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}
