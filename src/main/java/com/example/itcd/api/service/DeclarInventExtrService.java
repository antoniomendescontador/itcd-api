package com.example.itcd.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itcd.api.model.declaracao.DeclarInventExtr;
import com.example.itcd.api.repository.DeclarInventExtrRepository;

@Service
public class DeclarInventExtrService {

	@Autowired
	private DeclarInventExtrRepository repo;

	public DeclarInventExtr find(Long codigo) {
		DeclarInventExtr obj = repo.findOne(codigo);
		return obj;
	}

	public DeclarInventExtr insert(DeclarInventExtr obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
