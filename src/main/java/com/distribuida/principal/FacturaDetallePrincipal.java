package com.distribuida.principal;

import com.distribuida.entities.*;

import java.util.Date;

public class FacturaDetallePrincipal {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente(1, "1701234567", "Mario", "Montero", "Av. por ahí", "0987654321", "mariomontero143@gmail.com");

        // Crear factura
        Factura factura = new Factura(5, "FAC-00001", new Date(), 100.0, 15.0, 115.0, cliente);

        // Crear libro
        Categoria categoria = new Categoria(1, "Programación", "Libros sobre programación");
        Autor autor = new Autor(1, "Juan", "Pérez", "Ecuador", "Quito", "0991234567", "juanperez@email.com");
        Libro libro = new Libro(1, "Java Básico", "McGrawHill", 250, "1ra", "Español",
                new Date(), "Manual de introducción", "Dura", "123456789", 50, "portada.jpg",
                "Caja", 25.0, categoria, autor);

        // Crear detalle
        FacturaDetalle detalle = new FacturaDetalle(1, 2, 50.0, factura, libro);

        System.out.println(detalle);
    }
}
