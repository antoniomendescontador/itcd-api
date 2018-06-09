package com.example.itcd.api.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.itcd.api.model.ImovelRural;
import com.example.itcd.api.repository.ImovelRuralRepository;
import com.example.itcd.api.service.exception.DataIntegrityException;
import com.example.itcd.api.service.exception.ObjectNotFoundException;


@Service
public class ImovelRuralService {
	
	@Autowired
	private ImovelRuralRepository repo;
	
	public ImovelRural find(Long codigo) {
		ImovelRural obj = repo.findOne(codigo);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + codigo
					+ ", Tipo: " + ImovelRural.class.getName());
		}
		return obj;
	}
	
	public ImovelRural insert(ImovelRural obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}
	
	public ImovelRural update(ImovelRural obj, Long codigo) {
		ImovelRural objSalvo = repo.findOne(codigo);
		
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
	
	public List<ImovelRural> findAll() {
		return repo.findAll();
	}
	
	public Page<ImovelRural> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	
	
}
