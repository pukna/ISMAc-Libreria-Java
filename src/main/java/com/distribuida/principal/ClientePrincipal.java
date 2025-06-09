package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1,"1701234567","Mario", "Montero", "Av. por ahí.","0987654321", "mariomontero143@gmail.com");
        System.out.println(cliente);
    }
}
