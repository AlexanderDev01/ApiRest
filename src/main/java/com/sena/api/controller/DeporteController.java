package com.sena.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sena.api.model.DeporteEntity;
import com.sena.api.service.DeporteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/api/deporte")
public class DeporteController {
    @Autowired
    DeporteService deporteService;
    
    // Listar todos los Deportes
    @GetMapping("lista")
    public List<DeporteEntity> getListDeporte() {
        return deporteService.findAll();
    }
    
    // Buscar Deporte por ID
    @GetMapping("{idDeporte}")
    public List<DeporteEntity> findByIdDeporte(@PathVariable Integer idDeporte) {
        return deporteService.findByIdDeporte(idDeporte);
    }

    // Crear Deporte
    @PostMapping("/guardarDeporte")
    public DeporteEntity saveDeporte(@RequestBody DeporteEntity deporteEntity) {
        //TODO: process POST request
        
        return deporteService.saveDeporte(deporteEntity);
    }
    
    // Eliminar deporte

}
