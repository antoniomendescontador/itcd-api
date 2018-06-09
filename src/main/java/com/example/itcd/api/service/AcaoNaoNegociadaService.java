package com.example.itcd.api.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.itcd.api.model.AcaoNaoNegociadaBolsa;
import com.example.itcd.api.repository.AcaoNaoNegociadaRepository;
import com.example.itcd.api.service.exception.DataIntegrityException;
import com.example.itcd.api.service.exception.ObjectNotFoundException;


@Service
public class AcaoNaoNegociadaService {
	
	@Autowired
	private AcaoNaoNegociadaRepository repo;
	
	public AcaoNaoNegociadaBolsa find(Long codigo) {
		AcaoNaoNegociadaBolsa obj = repo.findOne(codigo);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + codigo
					+ ", Tipo: " + AcaoNaoNegociadaBolsa.class.getName());
		}
		return obj;
	}
	
	public AcaoNaoNegociadaBolsa insert(AcaoNaoNegociadaBolsa obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}
	
	public AcaoNaoNegociadaBolsa update(AcaoNaoNegociadaBolsa obj, Long codigo) {
		AcaoNaoNegociadaBolsa objSalvo = repo.findOne(codigo);
		BeanUtils.copyProperties(obj, objSalvo, "codigo","declaracao");
		return repo.save(objSalvo);
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
	
	public List<AcaoNaoNegociadaBolsa> findAll() {
		return repo.findAll();
	}
	
	public Page<AcaoNaoNegociadaBolsa> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	
	
}
