package com.sinensia.multas02.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sinensia.multas02.model.InfraccionPL;
import com.sinensia.multas02.model.MultaPL;
import com.sinensia.multas02.model.VehiculoPL;

@Repository
public interface MultaPLRepository extends JpaRepository<MultaPL, Long>{
	
	
	@Query("SELECT m FROM MultaPL m WHERE m.vehiculo.matricula = :matricula ")
	 List<MultaPL> getByMatricula(String matricula);
		
	@Query("SELECT m FROM MultaPL m WHERE m.vehiculo.matricula = :matricula AND m.fechaHora BETWEEN :desde AND :hasta")
	 List<MultaPL> getByBetweenFecha(String matricula, Date desde, Date hasta);

	@Query("SELECT m FROM MultaPL m WHERE m.vehiculo.matricula = :matricula AND m.importe >= :importe")
	 List<MultaPL> getByImporte(String matricula, double importe);

	@Query("SELECT m FROM MultaPL m WHERE m.longitud is null OR m.latitud is null")
	 List<MultaPL> getByLong();

	@Query("SELECT m FROM MultaPL m WHERE m.vehiculo.matricula LIKE %:expresion% ")
	List<MultaPL> getByExpresionMatricula(String expresion);

	@Query("SELECT m FROM MultaPL m WHERE m.infraccion = :infraccion ")
	List<MultaPL> getByInfraccion(InfraccionPL infraccion);
	
	@Modifying
	@Query("DELETE FROM MultaPL m WHERE m.vehiculo.matricula = :matricula ")
	List<MultaPL> deleteByMatricula(String matricula);
	
	@Query("SELECT COUNT(m.agente.codigo), m.agente.nombre, m.agente.apellido1, m.agente.apellido2 FROM MultaPL m GROUP BY m.agente.codigo")
	List<Object[]> countByAgente();

	@Query("SELECT COUNT(m.infraccion), m.infraccion FROM MultaPL m GROUP BY m.infraccion")
	List<Object[]> countByInfraccion();



}
