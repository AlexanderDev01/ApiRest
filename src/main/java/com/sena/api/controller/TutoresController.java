package com.sena.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sena.api.model.Tutores;
import com.sena.api.service.TutoresServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/tutores")
public class TutoresController {
    @Autowired
    TutoresServices tutoresServices;
    
    @GetMapping("/lista")
    public List<Tutores> getTutores() {
        return tutoresServices.FillTutores();
    }
    
    @GetMapping("/{materia}")
    public List<Tutores> getTutoresPorMateria(@PathVariable String materia) {
        return tutoresServices.obtenerTutoresPorMateria(materia);
    }
    
}
