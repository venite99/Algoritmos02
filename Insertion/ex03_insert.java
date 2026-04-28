package Insertion;
import java.util.Scanner;

public class ex03_insert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do seu vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];
        System.out.println("Digite os valores do seu vetor: ");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }

        System.out.println("Seu vetor: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        insertionSort(vetor);


         System.out.println("\nSeu vetor ordenado: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        sc.close();
    }

    public static void insertionSort(int[] vetor){
        int aux, j;
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
    }
}
