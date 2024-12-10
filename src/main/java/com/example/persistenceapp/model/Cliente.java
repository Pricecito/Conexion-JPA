package com.example.persistenceapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer dni;

    // En One ToOne no importa el dueña de la entidad pero conviene poner como dueño
    // a Cliente
    // cualquie cambio que se realize en el cliente tmb se vera reflejado en el
    // domicilio
    @OneToOne(cascade = CascadeType.ALL)
    // columna que contrendra llave foraneo de domicilio
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

}
