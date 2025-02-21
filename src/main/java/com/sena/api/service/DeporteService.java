package com.sena.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.api.model.DeporteEntity;
import com.sena.api.repository.DeporteRepository;

@Service
public class DeporteService{
    private final DeporteRepository deporteRepository;

    @Autowired
    public DeporteService(DeporteRepository deporteRepository) {
        this.deporteRepository = deporteRepository;
    }

    public List<DeporteEntity> findAll() {
        return deporteRepository.findAll();
    }

    public List<DeporteEntity> findByIdDeporte(Integer idDeporte) {
        return deporteRepository.findByIdDeporte(idDeporte);
    }

    public DeporteEntity saveDeporte(DeporteEntity deporteEntity) {
        return deporteRepository.save(deporteEntity);
    }
}
