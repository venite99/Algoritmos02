package Exercicios;

public class OrdenacaoMatriz {

    public static void selectionSort(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {3, 2, 1},
            {6, 5, 4},
            {9, 8, 7}
        };

        System.out.println("Entrada:");
        imprimirMatriz(matriz);

        int[] tudo = new int[9];
        int idx = 0;
        for (int[] linha : matriz)
            for (int val : linha)
                tudo[idx++] = val;

        selectionSort(tudo, tudo.length);

        idx = 0;
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                matriz[i][j] = tudo[idx++];

        System.out.println("Saída:");
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] m) {
        System.out.print("[");
        for (int i = 0; i < m.length; i++) {
            System.out.print("[");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                if (j < m[i].length - 1) System.out.print(", ");
            }
            System.out.print("]");
            if (i < m.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}