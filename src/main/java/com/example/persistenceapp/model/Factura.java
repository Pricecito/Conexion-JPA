package com.example.persistenceapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    private Integer numero;
    private BigDecimal total;

    @ManyToOne(cascade = CascadeType.PERSIST) // Solo vamos a queres persistir un cliente, si se borra una factura no se
                                              // eliminara o modificara el cliente
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;

    // orphan ayudara a eliminar todos los detalles cuando una factura sea eliminada
    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();

}
