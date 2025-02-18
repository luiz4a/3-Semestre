/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;

/**
 *
 * @author aluno.den
 */
import java.util.Scanner;
public class Atividade {

    public static void main(String[] args) {
        String teclado = new Scanner(System.in);
        
        String mercado = "Loja Mamão com Açucar";
        
        System.out.println("Qual o preço do produto:");
        String preco = teclado.next();
        
        int multiplicar = preco / 5;
        
        System.out.println("Nome do mercado: " + mercado);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Parcela: " + multiplicar);
        teclado.close();
         
    }
}
