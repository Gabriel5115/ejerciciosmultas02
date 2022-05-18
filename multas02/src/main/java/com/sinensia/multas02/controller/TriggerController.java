package com.sinensia.multas02.controller;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.multas02.model.AgentePL;
import com.sinensia.multas02.model.InfraccionPL;
import com.sinensia.multas02.model.MultaPL;
import com.sinensia.multas02.repositories.AgentePLRepository;
import com.sinensia.multas02.repositories.MultaPLRepository;


@RestController
public class TriggerController {
	
	
	@Autowired
	private MultaPLRepository multaPLRepository;
	
	@Autowired
	private AgentePLRepository agentePLRepository;
	
	
	@GetMapping("/multas")
	public List<MultaPL> getAllMultas(){
		
		return multaPLRepository.getByLong();
	}
	
	@GetMapping("/multas/vehiculo/{matricula}")
	public List<MultaPL> getAllByVehiculo(@PathVariable String matricula){

		return multaPLRepository.getByMatricula(matricula);
	}
	
	@GetMapping("/multas/fecha/{matricula}")
	public List<MultaPL> getAllByFecha(@PathVariable String matricula){
		
		return multaPLRepository.getByBetweenFecha(matricula, new Date(2020-02-15), new Date(2020-05-15));
	}
	
	@GetMapping("/multas/importe/{matricula}")
	public List<MultaPL> getAllByImporte(@PathVariable String matricula, 
										 @RequestParam(value = "importe") double importe){

		return multaPLRepository.getByImporte(matricula, importe);
	}
	
	@GetMapping("/multas/like/{expresion}")
	public List<MultaPL> getMultaByExpresion(@PathVariable(name = "expresion") String expresion){
		
		
		return multaPLRepository.getByExpresionMatricula(expresion);
	}
	
	@GetMapping("/multas/infraccion/{infraccion}")
	public List<MultaPL> getByInfraccion(@PathVariable InfraccionPL infraccion){
		
		return multaPLRepository.getByInfraccion(infraccion);
	}
	
	@Transactional
	@DeleteMapping("/multas/delete/{matricula}")
	public List<MultaPL> deleteByVehiculo(@PathVariable(value = "matricula") String matricula){

		return multaPLRepository.deleteByMatricula(matricula);
	}
	
	@GetMapping("/multas/count")
	public List<Object[]> countMultasByAgente(){
		
		return multaPLRepository.countByAgente();
	}
	
	@GetMapping("/multas/count/infraccion")
	public List<Object[]> countMultasByInfraccion(){
		
		return multaPLRepository.countByInfraccion();
	}
	
	
	
	
	
	
	
	@GetMapping("/agentes/{nombre}")
	public List<AgentePL> getAgenteByNombre(@PathVariable(name = "nombre") String nombre){
		
		return agentePLRepository.getByNombre(nombre);
	}
	
	
	@GetMapping("/agentes/like/{expresion}")
	public List<AgentePL> getAgenteByLike(@PathVariable(name = "expresion") String expresion){
		
		
		return agentePLRepository.findByLikeExpresion(expresion);
	}
	
	
	
	
	
}
