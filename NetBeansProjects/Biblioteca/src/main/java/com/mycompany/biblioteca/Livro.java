/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author aluno.den
 */
public class Livro {
    private String titulo;
    private String autor;
    private int Npaginas;
    private double valor;

    public Livro() {
    }

    public Livro(String titulo, String autor, int Npaginas, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.Npaginas = Npaginas;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpaginas() {
        return Npaginas;
    }

    public void setNpaginas(int Npaginas) {
        this.Npaginas = Npaginas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
      
}
