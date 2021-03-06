package com.example.itcd.api.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.itcd.api.model.Veiculo;
import com.example.itcd.api.service.VeiculoService;



@RestController
@RequestMapping(value="/veiculos")
public class VeiculoResource {
	
	@Autowired
	private VeiculoService service;
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.GET)
	public ResponseEntity<Veiculo> find(@PathVariable Long codigo) {
		Veiculo obj = service.find(codigo);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Veiculo obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{codigo}").buildAndExpand(obj.getCodigo()).toUri();
		return ResponseEntity.created(uri).build();
		/*possibilidade da fiscalizacao incluir mais um bem em um determinado inventário
		 *quando este não foi devidamente declarado e foi encontrado em alguma fiscalização
		 */
	}
	
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Veiculo obj, @PathVariable Long codigo) {
		obj = service.update(obj,codigo);
		return ResponseEntity.noContent().build();
	}
	

	@RequestMapping(value="/{codigo}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Long codigo) {
		service.delete(codigo);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Veiculo>> findAll() {
		List<Veiculo> list = service.findAll();
		//List<Veiculo> listDto = list.stream().map(obj -> new Veiculo(obj)).collect(Collectors.toList());  
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value="/page", method=RequestMethod.GET)
	public ResponseEntity<Page<Veiculo>> findPage(
			@RequestParam(value="page", defaultValue="0") Integer page, 
			@RequestParam(value="linesPerPage", defaultValue="24") Integer linesPerPage, 
			@RequestParam(value="orderBy", defaultValue="nome") String orderBy, 
			@RequestParam(value="direction", defaultValue="ASC") String direction) {
		Page<Veiculo> list = service.findPage(page, linesPerPage, orderBy, direction);
		//Page<VeiculoDTO> listDto = list.map(obj -> new VeiculoDTO(obj));  
		return ResponseEntity.ok().body(list);
	}
	
}