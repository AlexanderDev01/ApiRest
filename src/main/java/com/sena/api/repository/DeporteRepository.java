package com.sena.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sena.api.model.DeporteEntity;


public interface DeporteRepository extends JpaRepository<DeporteEntity, Integer> {
    
    @Query(value = "SELECT * FROM deportes WHERE deportes.id_deportes = :idDeporte;", nativeQuery = true)
    List<DeporteEntity> findByIdDeporte(Integer idDeporte);

}

