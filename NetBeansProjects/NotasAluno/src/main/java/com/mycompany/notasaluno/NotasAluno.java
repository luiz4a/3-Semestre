/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notasaluno;

/**
 *
 * @author aluno.den
 */
import java.util.Scanner;
        
public class NotasAluno {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = ler.next();
        
        System.out.println("Digite a primeira nota:");
        double primeiraNota = ler.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        double segundaNota = ler.nextDouble();
        
        double media = (primeiraNota + segundaNota) / 2 ;
        
        System.out.println("Média: " + media);
    }
}
