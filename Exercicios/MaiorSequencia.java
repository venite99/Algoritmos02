package Exercicios;

public class MaiorSequencia {

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static int maiorSequencia(int[] vetor) {
        insertionSort(vetor);

        int maior = 1;      // menor sequência possível é 1
        int atual = 1;      // contador da sequência atual

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] == vetor[i - 1] + 1) {
                // número é consecutivo ao anterior
                atual++;
                if (atual > maior) {
                    maior = atual;
                }
            } else if (vetor[i] != vetor[i - 1]) {
                // número não é consecutivo (ignora duplicatas)
                atual = 1;
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] vetor = {100, 4, 200, 1, 3, 2};

        System.out.print("Entrada:  [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        int resultado = maiorSequencia(vetor);

        System.out.print("Ordenado: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Tamanho da maior sequência: " + resultado);
    }
}