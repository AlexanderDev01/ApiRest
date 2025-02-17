package com.sena.api.model;

public class Tutores {
    String Nombre;
    String Materia;
    Integer experiencia;
    
    public Tutores() {
    }

    public Tutores(String nombre, String materia, Integer experiencia) {
        Nombre = nombre;
        Materia = materia;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

}
