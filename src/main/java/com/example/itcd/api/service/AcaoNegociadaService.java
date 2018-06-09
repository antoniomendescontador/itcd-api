package com.example.itcd.api.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.itcd.api.model.AcaoNegociadaBolsa;
import com.example.itcd.api.repository.AcaoNegociadaRepository;
import com.example.itcd.api.service.exception.DataIntegrityException;
import com.example.itcd.api.service.exception.ObjectNotFoundException;


@Service
public class AcaoNegociadaService {
	
	@Autowired
	private AcaoNegociadaRepository repo;
	
	public AcaoNegociadaBolsa find(Long codigo) {
		AcaoNegociadaBolsa obj = repo.findOne(codigo);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + codigo
					+ ", Tipo: " + AcaoNegociadaBolsa.class.getName());
		}
		return obj;
	}
	
	public AcaoNegociadaBolsa insert(AcaoNegociadaBolsa obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}
	
	public AcaoNegociadaBolsa update(AcaoNegociadaBolsa obj, Long codigo) {
		AcaoNegociadaBolsa veiculoSalvo = repo.findOne(codigo);
		
		BeanUtils.copyProperties(obj, veiculoSalvo, "codigo","declaracao");
		
		return repo.save(veiculoSalvo);
	}

	public void delete(Long codigo) {
		find(codigo);
		try {
			repo.delete(codigo);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir entidade que possui agregação");
		}
	}
	
	public List<AcaoNegociadaBolsa> findAll() {
		return repo.findAll();
	}
	
	public Page<AcaoNegociadaBolsa> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	
	
}
