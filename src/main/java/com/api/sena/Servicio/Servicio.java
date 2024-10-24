package com.api.sena.Servicio;

import org.springframework.stereotype.Service;

@Service
public class Servicio {

    public String getNombre(String nombre, String apellido) {
        // TODO Auto-generated method stub
        return "Tu Nombre es: " + nombre + " " + apellido;
    }
    
}
