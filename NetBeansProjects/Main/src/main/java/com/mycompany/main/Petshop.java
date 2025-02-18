/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author aluno.den
 */
public class Petshop {

    public static void main(String[] args) {
           
    Pets pets1 = new Pets ("penelope", 5, "shitzu","medio" ,"racao wiskas" );
    
    System.out.println("Nome: " +pets1.getNome());
    System.out.println("Idade: " +pets1.getIdade());
    System.out.println("Raça: " +pets1.getRaca());
    System.out.println("Porte: " +pets1.getPorte());
    System.out.println("Alimentação: " +pets1.getAlimentacao());
    
    
    
    System.out.println("========================");
    
    
    Pets pets2 = new Pets ("luana", 7, "dalmata","grande" ,"arroz" );
    
    System.out.println("Nome: " +pets2.getNome());
    System.out.println("Idade: " +pets2.getIdade());
    System.out.println("Raça: " +pets2.getRaca());
    System.out.println("Porte: " +pets2.getPorte());
    System.out.println("Alimentação: " +pets2.getAlimentacao());
    
}
}
