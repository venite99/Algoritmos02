package Correcao;

import java.util.Scanner;

public class BubbleSort {

   
    public static int bubbleSortDecrescente(int[] vetor) {
        int trocas = 0;
    	for(int x=0; x<vetor.length-1; x++) {
    		for(int y=0; y<vetor.length-1; y++) {
    			if(vetor[y]<vetor[y+1]){
    				int aux = vetor[y];
    				vetor[y] = vetor[y+1];
    				vetor[y+1] = aux;
    				trocas ++;
    			}
    		}
    	}
    	
        return trocas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        
        int trocas = bubbleSortDecrescente(vetor);
        
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        

        System.out.println();
        System.out.println(trocas);

        sc.close();
    }
}