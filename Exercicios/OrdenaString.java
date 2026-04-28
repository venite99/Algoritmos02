package Exercicios;
    import java.util.Scanner;

public class OrdenaString {

    public static void insertionSortStrings(String[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            String chave = vetor[i];
            int j = i - 1;
            // compareTo() retorna negativo se chave vem antes alphabeticamente
            while (j >= 0 && vetor[j].compareTo(chave) > 0) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consome o '\n'

        String[] vetor = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("  String " + (i + 1) + ": ");
            vetor[i] = scanner.nextLine().trim();
        }

        System.out.print("Entrada: ");
        imprimirVetor(vetor);

        insertionSortStrings(vetor);

        System.out.print("Saída:   ");
        imprimirVetor(vetor);

        scanner.close();
    }

    public static void imprimirVetor(String[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print("\"" + v[i] + "\"");
            if (i < v.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

