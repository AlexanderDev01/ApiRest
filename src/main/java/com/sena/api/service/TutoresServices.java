package com.sena.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sena.api.model.Tutores;

@Service
public class TutoresServices {
    
    // 4. Hacer un recurso que devuelva la lista de tutores. ( Nombre, Materia, años de experiencia).
    
    public List<Tutores> FillTutores() {

        List<Tutores> lista = new ArrayList<>();
            
        lista.add(new Tutores("Ricardo Cantillo", "Desarrollo de Software", 6));
        lista.add(new Tutores("Lester Navas", "Ingles", 4));
        lista.add(new Tutores("Yomaira Páez", "Etica", 5));
        lista.add(new Tutores("Miguel Olivare", "Excel", 6));
        lista.add(new Tutores("Olga Maria Rambal", "Comunicacion", 4));
        lista.add(new Tutores("Agustin Robledo", "Biologia", 6));

        return lista;
    }

    // 5. Hacer un recurso que liste los tutores de una materia dada.
   
    public List<Tutores> obtenerTutoresPorMateria(String materia) {
        
        List<Tutores> lista = new ArrayList<>();
        
        lista = FillTutores();
        
        return lista.stream()
                    .filter(tutor -> tutor.getMateria().equalsIgnoreCase(materia))
                    .collect(Collectors.toList());
    }

}
