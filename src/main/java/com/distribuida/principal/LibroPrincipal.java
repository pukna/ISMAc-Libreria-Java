package com.distribuida.principal;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

import java.util.Date;

public class LibroPrincipal {

    public static void main(String[] args) {
        Libro libro = new Libro(
                1,
                "Programación en Java",
                "Prentice Hall",
                500,
                "Tercera",
                "Español",
                new Date(),
                "Libro completo para aprender Java.",
                "Dura",
                "978-3-16-148410-0",
                30,
                "portada.jpg",
                "Caja",
                49.99
        );

        // Inyección externa (relaciones lógicas, pero no como atributos en Libro)
        Categoria categoria = new Categoria(1, "Tecnología", "Libros de programación y software.");
        Autor autor = new Autor(1, "Ada", "Lovelace", "Reino Unido", "Londres", "0991234567", "ada@lovelace.com");

        System.out.println(libro);
        System.out.println("Categoría asociada: " + categoria);
        System.out.println("Autor asociado: " + autor);
    }

}
