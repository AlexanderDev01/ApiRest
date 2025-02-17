package com.sena.api.model;


public class Aprendiz {
    
     private Integer documentoIdentidad;
     private String nombreCompleto;
     private Integer edad;
    
    public Aprendiz() {
    }


    

    public Aprendiz(Integer documentoIdentidad, String nombreCompleto, Integer edad) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }




    public Integer getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(Integer documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

     




}
