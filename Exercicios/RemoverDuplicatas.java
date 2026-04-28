package Exercicios;

public class RemoverDuplicatas {

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

    public static int removerDuplicatas(int[] vetor) {
        insertionSort(vetor);

        // 'escrita' aponta onde o próximo único elemento será gravado
        int escrita = 1;

        for (int leitura = 1; leitura < vetor.length; leitura++) {
            if (vetor[leitura] != vetor[leitura - 1]) {
                // elemento diferente do anterior: guarda na posição 'escrita'
                vetor[escrita] = vetor[leitura];
                escrita++;
            }
            // se for igual, apenas avança 'leitura' sem gravar nada
        }

        return escrita; // novo tamanho válido do vetor
    }

    public static void main(String[] args) {
        int[] vetor = {4, 2, 2, 8, 4, 9};

        System.out.print("Entrada: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        int novoTamanho = removerDuplicatas(vetor);

        System.out.print("Saída:   [");
        for (int i = 0; i < novoTamanho; i++) {
            System.out.print(vetor[i]);
            if (i < novoTamanho - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Tamanho: " + novoTamanho);
    }
}