package com.example.persistenceapp;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.persistenceapp.model.Articulo;
import com.example.persistenceapp.model.Categoria;
import com.example.persistenceapp.model.Cliente;
import com.example.persistenceapp.model.DetalleFactura;
import com.example.persistenceapp.model.Domicilio;
import com.example.persistenceapp.model.Factura;

@SpringBootApplication
public class PersistenceappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersistenceappApplication.class, args);

		Factura factura1 = new Factura();

		factura1.setNumero(12);
		factura1.setFecha("2022-01-01");

		Domicilio dom1 = new Domicilio();
		dom1.setNombreCalle("SanMartin");
		dom1.setNumero(112);

		Cliente cli = new Cliente();
		cli.setNombre("Juan");
		cli.setApellido("Perez");
		cli.setDni(125698);
		cli.setDomicilio(dom1);
		dom1.setCliente(cli);
		factura1.setCliente(cli);

		Categoria cat1 = new Categoria();
		cat1.setDenominacion("Electronica");
		Categoria cat2 = new Categoria();
		cat2.setDenominacion("Lacteos");
		Categoria cat3 = new Categoria();
		cat3.setDenominacion("Limpieza");

		Articulo art1 = new Articulo();
		art1.setDenominacion("Yogurt Ser");
		art1.setCantidad(200);

		Articulo art2 = new Articulo();
		art2.setDenominacion("Detergente Magistral");
		art2.setCantidad(82);

		art1.getCategorias().add(cat1);
		art2.getCategorias().add(cat3);

		cat2.getArticulos().add(art1);
		cat3.getArticulos().add(art2);

		DetalleFactura det1 = new DetalleFactura();
		det1.setArticulo(art1);
		det1.setCantidad(2);
		det1.setSubtotal(40.5);

		art1.getDetalles().add(det1);

		factura1.getDetalles().add(det1);

		det1.setFactura(factura1);

		DetalleFactura det2 = new DetalleFactura();
		det2.setArticulo(art2);
		det2.setCantidad(6);
		det2.setSubtotal(50.0);

		art2.getDetalles().add(det2);

		factura1.getDetalles().add(det2);

		det2.setFactura(factura1);

		factura1.setTotal(BigDecimal.valueOf(90.5));

	}

}
