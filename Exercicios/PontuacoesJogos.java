package Exercicios;

import java.util.Scanner;

public class PontuacoesJogos {

    public static void insertionSortDecrescente(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] < chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de jogadores: ");
        int n = scanner.nextInt();

        int[] pontuacoes = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("  Pontuação do jogador " + (i + 1) + ": ");
            pontuacoes[i] = scanner.nextInt();
        }

        insertionSortDecrescente(pontuacoes);

        System.out.print("Pontuações Ordenadas: [");
        for (int i = 0; i < pontuacoes.length; i++) {
            System.out.print(pontuacoes[i]);
            if (i < pontuacoes.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Pontuação Mais Alta: " + pontuacoes[0]);

        scanner.close();
    }
}