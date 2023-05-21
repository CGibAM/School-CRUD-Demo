package com.example.demo.pojos;



import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class HorarioPOJO {
	 
	@Id
	@Basic(optional=false)
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private int usuario;
	
	@Column
	private int grado;
	
	@Column
	private int materia;
	
	@Column(name="hora_inicio")
	private int horaInicio;
	
	@Column(name="hora_fin")
	private int horaFin;

	public HorarioPOJO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public int getMateria() {
		return materia;
	}

	public void setMateria(int materia) {
		this.materia = materia;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}
		
	
}
