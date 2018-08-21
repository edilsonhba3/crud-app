package com.crud.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudiante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String dui;
	private String nombre;
	private String apellido;
	private String telefono;
	private Integer edad;
	private Double promedio;
	@Column(insertable=false)
	private Date fecha;

	public Estudiante() {
	}
	
	public Estudiante(Integer id, String dui, String nombre, String apellido, String telefono, Integer edad,
			Double promedio, Date fecha) {
		this.id = id;
		this.dui = dui;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.edad = edad;
		this.promedio = promedio;
		this.fecha = fecha;
	}
	
	public Estudiante(Integer id, String dui, String nombre, String apellido, String telefono, Integer edad,
			Double promedio) {
		this.id = id;
		this.dui = dui;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.edad = edad;
		this.promedio = promedio;
	}
	
	public Estudiante(String dui, String nombre, String apellido, String telefono, Integer edad,
			Double promedio) {
		this.dui = dui;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.edad = edad;
		this.promedio = promedio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
