package com.distribuida.principal;

import com.distribuida.entities.Categoria;

public class CategoriaPrincipal {
    public static void main(String[] args) {
        Categoria categoria = new Categoria(1, "Literatura", "Libros de narrativa, poesía, ensayo y otros géneros literarios.");
        System.out.println(categoria);
    }

}
