package com.sinensia.multas02.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENTES")
public class AgentePL implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long codigo;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	
	

	public AgentePL() {
		
	}

	
	
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgentePL other = (AgentePL) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "AgentePL [codigo=" + codigo + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + "]";
	}
	
	
	
	
	
	
	
	
	

	
	
}
