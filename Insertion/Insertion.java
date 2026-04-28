package Insertion;
public class Insertion{
    public static void main(String[] args) {
        
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()*vetor.length);
        }

        System.out.println("Vetor: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        //Inserção
        int aux, j;
        int comparacao = 0;
        int movimentacao = 0;
        for(int i=0; i<vetor.length; i++){
            aux = vetor[i];
            j = i-1;

            while(j >= 0) {
                comparacao++;             //Contando comparações
                if(vetor[j] > aux){
                vetor[j+1] = vetor[j];
                movimentacao++;           //Contando trocas
                j --;
                }else{
                    break;
                }
            }
            vetor[j+1] = aux;
            movimentacao++;               //Contando trocas
        }

         System.out.println("Ordenado: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
         System.out.println("Comparações: " + comparacao);
         System.out.println("Trocas: " + movimentacao);
    }
}