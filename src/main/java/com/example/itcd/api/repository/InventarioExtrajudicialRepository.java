package com.example.itcd.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.itcd.api.model.InventarioExtrajudicial;

@Repository
public interface InventarioExtrajudicialRepository extends JpaRepository<InventarioExtrajudicial, Long>{

}
