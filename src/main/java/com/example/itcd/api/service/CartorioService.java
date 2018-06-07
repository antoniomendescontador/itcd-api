package com.example.itcd.api.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.itcd.api.model.Cartorio;
import com.example.itcd.api.repository.CartorioRepository;
import com.example.itcd.api.service.exception.DataIntegrityException;
import com.example.itcd.api.service.exception.ObjectNotFoundException;


@Service
public class CartorioService {
	
	@Autowired
	private CartorioRepository repo;
	
	public Cartorio find(Long codigo) {
		Cartorio obj = repo.findOne(codigo);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + codigo
					+ ", Tipo: " + Cartorio.class.getName());
		}
		return obj;
	}
	
	public Cartorio insert(Cartorio obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}
	
	public Cartorio update(Cartorio obj, Long codigo) {
		Cartorio cartorioSalvo = repo.findOne(codigo);
		BeanUtils.copyProperties(obj, cartorioSalvo, "codigo");
		return repo.save(cartorioSalvo);
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
	
	public List<Cartorio> findAll() {
		return repo.findAll();
	}
	
	public Page<Cartorio> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	
	
}
