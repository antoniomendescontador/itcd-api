package com.example.itcd.api.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.itcd.api.model.Servidor;
import com.example.itcd.api.repository.ServidorRepository;
import com.example.itcd.api.service.exception.DataIntegrityException;
import com.example.itcd.api.service.exception.ObjectNotFoundException;


@Service
public class ServidorService {
	
	@Autowired
	private ServidorRepository repo;
	
	public Servidor find(Long codigo) {
		Servidor obj = repo.findOne(codigo);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + codigo
					+ ", Tipo: " + Servidor.class.getName());
		}
		return obj;
	}
	
	public Servidor insert(Servidor obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}
	
	public Servidor update(Servidor obj, Long codigo) {
		Servidor objSalvo = repo.findOne(codigo);
		BeanUtils.copyProperties(obj, objSalvo, "codigo");
		return repo.save(objSalvo);
	}

	public void delete(Long codigo) {
		find(codigo);
		try {
			repo.delete(codigo);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir contem Declaração!");
		}
	}
	
	public List<Servidor> findAll() {
		return repo.findAll();
	}
	
	public Page<Servidor> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	
	
}
