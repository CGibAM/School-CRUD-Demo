package com.example.demo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Kardex {
	@Id
	@Basic(optional=false)
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer materia;
	
	@Column
	private Integer usuario;
	
	@Basic(optional=false)
	@Column
	private Double calificacion;

	public Kardex() {
	}

	public Integer getId() {
		return id;
	}

	public Integer getMateria() {
		return materia;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMateria(Integer materia) {
		this.materia = materia;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
	
}
