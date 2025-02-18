/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conferindodados;
import java.util.Scanner;


/**
 *
 * @author aluno.den
 */
public class Conferindodados {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindos a página de login!");
        
        //String usuario = "Marta@gmail.com";
        //String senha = "123456789";
        
        
        System.out.println("Digite o usuario ou email: ");
        String usuario = scanner.nextLine();
        
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        
        
        while (!"123456789".equals(senha) && !"Marta@gmail.com".equals(usuario)){
            System.out.println("Usuario invalido OU senha incorreta, Tente Novamente!");
            System.out.println("Digite o usuario ou email:");
            System.out.println("Digite a senha: ");
            
           
        }
        while ("Marta@gmail.com".equals(usuario) && "123456789".equals(senha)){
            System.out.println("Bem vindo, Usuario logado!");
            break;
        }
        
       
        
    }
}
