package com.example.persistenceapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCalle;
    private Integer numero;
    // PARA realizar una relacion inversa
    // necesita el nombre del objeto dueño de la relación (nombre del atributo en
    // relación)
    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;
}
