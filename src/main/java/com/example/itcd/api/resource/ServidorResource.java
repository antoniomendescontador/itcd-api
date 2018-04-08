package com.example.itcd.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.itcd.api.model.partes.Servidor;
import com.example.itcd.api.repository.ServidorRepository;

@RestController
@RequestMapping("/servidores")
public class ServidorResource {
	
	@Autowired
	private ServidorRepository servidorRepository;
	
	@GetMapping
	public List<Servidor> listar(){
		return servidorRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Servidor> buscarPeloCodigo(@PathVariable Long codigo){
		Servidor partes = servidorRepository.findOne(codigo);
		return partes !=null? ResponseEntity.ok(partes):ResponseEntity.notFound().build();
	}
	

}
