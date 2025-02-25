package com.sena.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "deportes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeporteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_deportes")
    Integer idDeporte;
    @Column(name = "nombre_deportes")
    String nombreDeporte;

}
