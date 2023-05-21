package com.example.demo.pojos;

import java.util.Date;

public class UsuariosPOJO {
	
	private Integer id;

	private String perfil;

	private Integer age;

	private String genero;
	
	private String email;

	private String psw;

	private Date fechaIngreso;
	
	private Integer escuelaId;

	private Boolean activo;
	
	public UsuariosPOJO() {
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

	public void setAge(Integer age) {
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
