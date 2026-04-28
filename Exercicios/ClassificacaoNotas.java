package Exercicios;

import java.util.Scanner;

public class ClassificacaoNotas {

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static double calcularMediana(int[] vetor) {
        int n = vetor.length;
        if (n % 2 == 0) {
            return (vetor[n / 2 - 1] + vetor[n / 2]) / 2.0;
        } else {
            return vetor[n / 2];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int n = scanner.nextInt();

        int[] notas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("  Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }

        insertionSort(notas);

        System.out.print("Notas Ordenadas: [");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]);
            if (i < notas.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Mediana: " + calcularMediana(notas));

        scanner.close();
    }
}