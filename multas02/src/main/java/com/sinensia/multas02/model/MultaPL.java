package com.sinensia.multas02.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "MULTAS")
public class MultaPL implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name = "CODIGO_AGENTE")
	private AgentePL agente;
	
	@ManyToOne
	@JoinColumn(name = "MATRICULA_VEHICULO")
	private VehiculoPL vehiculo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaHora;
	
	private Long longitud;
	private Long latitud;
	private double importe;
	private String observaciones;
	
	@Enumerated(EnumType.STRING)
	private InfraccionPL infraccion;
	
	
	
	
	public MultaPL() {
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Long getLongitud() {
		return longitud;
	}

	public void setLongitud(Long longitud) {
		this.longitud = longitud;
	}

	public Long getLatitud() {
		return latitud;
	}

	public void setLatitud(Long latitud) {
		this.latitud = latitud;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public InfraccionPL getInfraccionPl() {
		return infraccion;
	}

	public void setInfraccionPl(InfraccionPL infraccion) {
		this.infraccion = infraccion;
	}

	public AgentePL getAgente() {
		return agente;
	}

	public void setAgente(AgentePL agente) {
		this.agente = agente;
	}

	public VehiculoPL getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoPL vehiculo) {
		this.vehiculo = vehiculo;
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
		MultaPL other = (MultaPL) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "MultaPL [codigo=" + codigo + ", fechaHora=" + fechaHora + ", longitud=" + longitud + ", latitud="
				+ latitud + ", importe=" + importe + ", observaciones=" + observaciones + ", infraccionPl="
				+ infraccion + ", agente=" + agente + ", vehiculo=" + vehiculo + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
