package com.sena.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.api.model.DeporteEntity;

public interface DeporteRepository extends JpaRepository<DeporteEntity, Integer> {
    
}

