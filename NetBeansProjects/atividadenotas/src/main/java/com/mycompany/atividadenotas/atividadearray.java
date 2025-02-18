/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadenotas;
import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class atividadearray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine ();
        
        double[] notas = new double[2];
      
        for(int i =0; i< 2; i++){
        System.out.println("Digite a " + (i + 1) + "º nota: ");
        notas [i] = scanner.nextDouble();
    
        
         System.out.println("Nome do aluno: " + nome);
          
            for (double nota: notas){
            System.out.println("Notas: " + nota);
    }
          }
}
}