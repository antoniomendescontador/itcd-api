package com.example.itcd.api.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.itcd.api.model.Veiculo;
import com.example.itcd.api.repository.VeiculoRepository;
import com.example.itcd.api.service.exception.DataIntegrityException;
import com.example.itcd.api.service.exception.ObjectNotFoundException;


@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repo;
	
	public Veiculo find(Long codigo) {
		Veiculo obj = repo.findOne(codigo);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + codigo
					+ ", Tipo: " + Veiculo.class.getName());
		}
		return obj;
	}
	
	public Veiculo insert(Veiculo obj) {
		obj.setCodigo(null);
		return repo.save(obj);
	}
	
	public Veiculo update(Veiculo obj, Long codigo) {
		Veiculo veiculoSalvo = repo.findOne(codigo);
		
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
	
	public List<Veiculo> findAll() {
		return repo.findAll();
	}
	
	public Page<Veiculo> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = new PageRequest(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	
	
}
