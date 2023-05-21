package com.example.demo.entities;


import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Materia {
	@Id
	@Basic(optional = false)
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Basic(optional = false)
	@Column
	private Integer nombre;
	
	@Basic(optional = false)
	@Column
	private Boolean activo;
	
	public Materia() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNombre() {
		return nombre;
	}

	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
}
