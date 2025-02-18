/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientes1;

/**
 *
 * @author aluno.den
 */
public class Main {
    public static void main(String[] args) {
      // Cliente cliente = new Cliente ();

       //cliente.nome = "Marta";
      // System. out.println ("Nome: " + cliente.nome); 
        Cliente cliente = new Cliente ("Marta", "marta@gmail.com", 42);

        cliente.setIdade (50);

        System. out.println ("Nome: " + cliente.getNome () );
        System. out.println("Idade: " + cliente.getIdade ());
        System. out.println("E-mail: " + cliente.getEmail());
      
    }
    
}
