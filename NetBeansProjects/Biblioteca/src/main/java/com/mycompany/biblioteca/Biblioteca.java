/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author aluno.den
 */
public class Biblioteca {
    public static void main(String[] args) {
    
    Livro livro = new Livro ("ondas", "joao", 45, 50.25);
    
    System.out.println("Titulo: " +livro.getTitulo());
    System.out.println("Autor: " +livro.getAutor());
    System.out.println("Numero de Paginas: " +livro.getNpaginas());
    System.out.println("Valor: " +livro.getValor());
    
    
    Livro livro2 = new Livro ("ondas do mar", "joao Batista ", 45, 50.25);
    
    
    System.out.println("=======================");
    System.out.println("Titulo: " +livro2.getTitulo());
    System.out.println("Autor: " +livro2.getAutor());
    System.out.println("Numero de Paginas: " +livro2.getNpaginas());
    System.out.println("Valor: " +livro2.getValor());
    
    
    
    
    }
    
    
}
