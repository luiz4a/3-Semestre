package com.mycompany.atividadenotas;
import java.util.Scanner;

public class arrayatividadechat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando o nome do aluno
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        // Criando um array para armazenar as notas
        double[] notas = new double[2];

        // Coletando as notas
        for (int i = 0; i < 2; i++) {
            boolean notaValida = false;
            while (!notaValida) {
                System.out.println("Digite a " + (i + 1) + "º nota: ");
                notas[i] = scanner.nextDouble();

                // Verificando se a nota está dentro do intervalo válido (0 a 10)
                if (notas[i] >= 0 && notas[i] <= 10) {
                    notaValida = true;
                } else {
                    System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
                }
            }
        }

        // Exibindo as informações coletadas
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Notas do aluno:");
        for (double nota : notas) {
            System.out.println(nota);
        }
    }
}
