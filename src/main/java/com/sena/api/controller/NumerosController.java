package com.sena.api.controller;

import org.springframework.web.bind.annotation.RestController;
import com.sena.api.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class NumerosController {

    @Autowired
    NumeroService numeroService; 
      
    @GetMapping("/api/numeros/sumar/{n1}/{n2}")
    public Integer getSumar(@PathVariable Integer n1,@PathVariable Integer n2 ) {   
        return  numeroService.sumar(n1,n2);
    }
    
    
}
