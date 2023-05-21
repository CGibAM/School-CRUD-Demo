package com.example.demo.entities;



import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Horario {
	 
	@Id
	@Basic(optional=false)
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer usuario;
	
	@Column
	private Integer grado;
	
	@Column
	private Integer materia;
	
	@Column(name="hora_inicio")
	private Integer horaInicio;
	
	@Column(name="hora_fin")
	private Integer horaFin;

	public Horario() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(Integer grado) {
		this.grado = grado;
	}

	public int getMateria() {
		return materia;
	}

	public void setMateria(Integer materia) {
		this.materia = materia;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Integer horaFin) {
		this.horaFin = horaFin;
	}
		
	
}
