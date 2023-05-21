package com.example.demo.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuarios {
	
	@Id
	@Basic(optional= false)
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Basic(optional= false)
	@Column
	private String perfil;
	
	@Basic(optional= false)
	@Column
	private int age;
	
	@Basic(optional= false)
	@Column
	private String genero;
	
	@Basic(optional= false)
	@Column
	private String email;
	
	@Basic(optional= false)
	@Column
	private String psw;
	
	@Basic(optional= false)
	@Column (name="fecha_ingreso")
	private Date fechaIngreso;
	
	@Column (name="escuela_id")
	private int escuelaId;
	
	@Basic(optional= false)
	@Column
	@JsonIgnore //Anotación para escinder un elemento de la tabla, Wakis, usaro POJOS
	private Boolean activo;
	
	public Usuarios() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getEscuelaId() {
		return escuelaId;
	}

	public void setEscuelaId(int escuelaId) {
		this.escuelaId = escuelaId;
	}

	public Boolean isActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}
