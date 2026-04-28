package Selection;

public class ex02_select {
      public static void main(String[] args) {
         int[] vetor = {8,6,9,7,4,2,1};
    selectionSort(vetor);

    System.out.println();
    System.out.println("\nVetor ordenado: ");
    for(int i=0; i<vetor.length; i++){
        System.out.print(vetor[i] + " ");
    }
    }

    public static void selectionSort(int[] vetor){

        int trocas = 0;
        int comparacoes = 0;
        for(int i = 0; i < vetor.length -1; i++){
            int menor = i;

            for(int j = i+1; j < vetor.length; j++){
                comparacoes++;
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = temp;
            trocas++;

             System.out.println("\nPasso: "+i);
             for(int k=0; k<vetor.length; k++){
             System.out.println(vetor[k] + " ");
             }
        }
        System.out.println("Trocas: "+ trocas);
         System.out.println("Comparações: "+ comparacoes);
    }
}
