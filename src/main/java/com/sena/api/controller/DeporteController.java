package com.sena.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sena.api.model.DeporteEntity;
import com.sena.api.service.DeporteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DeporteController {
    @Autowired
    DeporteService deporteService;
    
    @GetMapping("/api/deporte/lista")
    public List<DeporteEntity> getListDeporte() {
        return deporteService.findAll();
    }
    
}
