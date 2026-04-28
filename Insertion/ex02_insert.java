package Insertion;
//Mostrar o vetor a cada passo


public class ex02_insert {
    public static void main(String[] args) {
        int[] vetor = new int[5];

        for(int i=0; i<vetor.length; i++){
            vetor[i] = (int) (Math.random()*vetor.length);
        }
        
        System.out.println("Vetor gerado: ");
        for(int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }

        int aux, j;
        for(int i=1; i<vetor.length; i++){
            aux = vetor[i];
            j = i-1;
            while (j >=0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;

            System.out.print("\nPasso " + i + ": ");
            for(int k=0; k<vetor.length; k++){
                System.out.print(vetor[k] + " ");
            }
        }
        System.out.println("\nVetor Ordenado: ");
        for(int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
