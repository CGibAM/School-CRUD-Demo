package com.example.demo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import jakarta.etc para las entities
@Entity
public class Escuela {
	
	//Unico para ID
	@Id
	@Basic(optional= false) //Igual a not null
	@Column (name= "id") //Define como se llam a tu columna en tu base de datos
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Para las llaves primarias que se auto-incrementan en las bases de datos
	private Integer id; //Definbe como reconoce la columna Spring, en camelCase
	
	@Basic(optional= false) 
	@Column
	private int nombre;
	
	@Column
	private int direccion;
	
	@Column
	private int cp;
	
	@Basic(optional= false) 
	@Column
	private boolean activo;
	
	//Deben tener minimo un constructor vacio
	
	public Escuela() {
		
	}

	// Getters y Setters para acceder a los datos
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}

	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(Integer direccion) {
		this.direccion = direccion;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
}
