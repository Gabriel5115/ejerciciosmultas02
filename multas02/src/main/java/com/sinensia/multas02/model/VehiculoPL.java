package com.sinensia.multas02.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICULOS")
public class VehiculoPL implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	
	
	
	
	public VehiculoPL() {
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehiculoPL other = (VehiculoPL) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "VehiculoPL [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ "]";
	}
	
	
	
	
	
	
	
}
