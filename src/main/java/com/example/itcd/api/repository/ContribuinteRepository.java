package com.example.itcd.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.itcd.api.model.Contribuinte;

@Repository
public interface ContribuinteRepository extends JpaRepository<Contribuinte, Long> {

}
