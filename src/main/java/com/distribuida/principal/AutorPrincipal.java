package com.distribuida.principal;

import com.distribuida.entities.Autor;

public class AutorPrincipal {
    public static void main(String[] args) {
        Autor autor = new Autor(1, "Gabriel", "García Márquez", "Colombia", "Aracataca", "0999999999", "gabriel@realismo.com");
        System.out.println(autor);
    }

}
