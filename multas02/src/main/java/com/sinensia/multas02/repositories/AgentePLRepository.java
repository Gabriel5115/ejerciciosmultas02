package com.sinensia.multas02.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sinensia.multas02.model.AgentePL;


@Repository
public interface AgentePLRepository extends JpaRepository<AgentePL, Long>{
	
	
	List<AgentePL> getByNombre(String nombre);
	
	
	
		
	@Query("SELECT a FROM AgentePL a WHERE a.nombre LIKE %:expresion% OR a.apellido1 LIKE %:expresion% OR a.apellido2 LIKE %:expresion%")
	List<AgentePL> findByLikeExpresion(String expresion);
}
