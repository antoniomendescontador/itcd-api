package com.example.itcd.api.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.itcd.api.model.IndiceAtualizacao;
import com.example.itcd.api.repository.IndiceAtualizacaoRepository;
import com.example.itcd.api.service.exception.DataIntegrityException;
import com.example.itcd.api.service.exception.ObjectNotFoundException;


@Service
public class IndiceAtualizacaoService {
	
	@Autowired
	private IndiceAtualizacaoRepository repo;
	
	public IndiceAtualizacao find(Long codigo) {
		IndiceAtualizacao obj = repo.findOne(codigo);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + codigo
					+ ", Tipo: " + IndiceAtualizacao.class.getName());
		}
		return obj;
	}
	
	public IndiceAtualizacao insert(IndiceAtualizacao obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}
	
	public IndiceAtualizacao update(IndiceAtualizacao obj, Long codigo) {
		IndiceAtualizacao cartorioSalvo = repo.findOne(codigo);
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
	
	public List<IndiceAtualizacao> findAll() {
		return repo.findAll();
	}
	
	public Page<IndiceAtualizacao> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	
	
}
