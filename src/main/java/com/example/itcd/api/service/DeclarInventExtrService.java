package com.example.itcd.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itcd.api.model.InventarioExtrajudicial;
import com.example.itcd.api.repository.DeclarInventExtrRepository;

@Service
public class DeclarInventExtrService {

	@Autowired
	private DeclarInventExtrRepository repo;

	public InventarioExtrajudicial find(Long codigo) {
		InventarioExtrajudicial obj = repo.findOne(codigo);
		return obj;
	}

	public InventarioExtrajudicial insert(InventarioExtrajudicial obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
