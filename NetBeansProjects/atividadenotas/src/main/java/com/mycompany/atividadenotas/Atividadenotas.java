/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadenotas;

import java.util.Scanner;


public class Atividadenotas {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      
      System.out.println("Digite o nome do aluno:");
      String nome = scanner.nextLine ();
        
      System.out.println("Digite a 1º nota?: ");
      double primeira_nota = scanner.nextDouble();
      
      System.out.println("Digite a 2º nota:  ");
      double segunda_nota = scanner.nextDouble();
      
       while (primeira_nota < 0 || primeira_nota > 10){
            System.out.println("Nota invalida");
            System.out.println("Digite sua 1º nota: ");
            primeira_nota = scanner.nextDouble();

        }
       while (segunda_nota < 0 || segunda_nota> 10){
            System.out.println("Nota invalida");
            System.out.println("Digite sua 2º nota: ");
            segunda_nota = scanner.nextDouble();

        }
      
      double soma = primeira_nota + segunda_nota;
      double media = soma / 2;

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Media: " + media);
      

      if (media >= 7) {
      System.out.println("Aprovado!");
      } else if (media >= 5 ) {
      System.out.println("Recuperação");
      }
      else {
      System.out.println("Reprovado");
    }
      
    }
}
