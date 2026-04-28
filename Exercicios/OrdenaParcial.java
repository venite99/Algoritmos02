package Exercicios;
import java.util.Scanner;

public class OrdenaParcial {

    public static void selectionSortParcial(int[] vetor, int n) {
        // Ordena apenas os índices 0 até n-1
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = vetor[i];
                vetor[i] = vetor[minIdx];
                vetor[minIdx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];
        System.out.println("Digite os elementos:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("  vetor[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Valor de N (elementos a ordenar): ");
        int n = scanner.nextInt();

        System.out.print("Entrada: ");
        imprimirVetor(vetor);
        System.out.println("N = " + n);

        selectionSortParcial(vetor, n);

        System.out.print("Saída:   ");
        imprimirVetor(vetor);

        scanner.close();
    }

    public static void imprimirVetor(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}