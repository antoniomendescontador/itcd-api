package com.example.itcd.api.resource;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.itcd.api.model.InventarioExtrajudicial;
import com.example.itcd.api.service.InventarioExtrajudicialService;

@RestController
@RequestMapping("/declaracoes")
public class InventarioExtrajudicialResource {
	
	@Autowired
	private InventarioExtrajudicialService service;
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.GET)
	public ResponseEntity<InventarioExtrajudicial> find(@PathVariable Long codigo){
		InventarioExtrajudicial obj = service.find(codigo);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody InventarioExtrajudicial inventario) {
		inventario = service.insert(inventario);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{codigo}").buildAndExpand(inventario.getCodigo()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.PUT)
	public ResponseEntity<InventarioExtrajudicial> atualizar(@PathVariable Long codigo, @Valid @RequestBody InventarioExtrajudicial inventario) {
		InventarioExtrajudicial inventarioSalvo = service.atualizar(codigo, inventario);
		return ResponseEntity.ok(inventarioSalvo);
	}
	
	

	

}