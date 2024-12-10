package com.example.persistenceapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERSONAS")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPersona;

    // cuando un atributo no tiene la anotación @Column toma como nombre el nombre
    // del mismo atributo
    @Column(name = "nombre", length = 50)
    private String nombre;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
