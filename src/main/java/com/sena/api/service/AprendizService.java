package com.sena.api.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.sena.api.model.Aprendiz;

@Service
public class AprendizService {

    public List<Aprendiz> getList() {
        
        List<Aprendiz> lista = new ArrayList<>();

        lista = fillListAprendices();
       
        return lista;   
        
    }
    
    public Aprendiz getMayorEdad() {
        
        List<Aprendiz> lista = new ArrayList<>();
        
        lista = fillListAprendices();
        
        return lista.stream()
                .max((a1, a2) -> Integer.compare(a1.getEdad(), a2.getEdad()))
                .orElse(null);  
        
    }

    public List<Aprendiz> fillListAprendices() {
        List<Aprendiz> lista = new ArrayList<>();

        lista.add(new Aprendiz(123, "Hector", 40) );
        lista.add(new Aprendiz(234, "Maurico", 38));
        lista.add(new Aprendiz(245, "Daniel", 17));
        lista.add(new Aprendiz(267, "Gerson", 21));
        lista.add(new Aprendiz(123, "Maria", 25) );
        lista.add(new Aprendiz(234, "Andres Barreto", 50));
        lista.add(new Aprendiz(245, "Pedro", 20));
        lista.add(new Aprendiz(267, "Juan", 18));
        
        return lista;
    }

    public double getPromedioEdad() {
        
        List<Aprendiz> lista = new ArrayList<>();
        
        lista = fillListAprendices();
        
        return lista.stream()
        .mapToInt(Aprendiz::getEdad) // Extrae la edad
        .average() // Calcula el promedio
        .orElse(0.0); // Manejo en caso de lista vacía;  
        
    }

}
