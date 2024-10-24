package com.api.sena.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.sena.Servicio.Servicio;



@RestController
public class ApiRest {
    @Autowired
    Servicio servicio;

    @GetMapping("/nombre/{nombre}/{apellido}")
    public String getNombre(@PathVariable String nombre, @PathVariable String apellido) {
        return servicio.getNombre(nombre, apellido);
    }
    
}
