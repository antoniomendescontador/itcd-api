package com.example.itcd.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.itcd.api.model.IndiceAtualizacao;

@Repository
public interface IndiceAtualizacaoRepository extends JpaRepository<IndiceAtualizacao, Long> {

}
