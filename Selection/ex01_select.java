package Selection;

public class ex01_select {
    public static void main(String[] args) {
         int[] vetor = {8,6,9,7,4,2,1};
    selectionSort(vetor);

    System.out.println();
    System.out.println("\nVetor ordenado: ");
    for(int i=0; i<vetor.length; i++){
        System.out.print(vetor[i] + " ");
    }
    }

    public static void selectionSort(int[] vetor) {

        int i, menor, temp, j;

        for(i=0; i<vetor.length-1;i++){
            menor = i;
            for(j=i+1; j<vetor.length; j++){
                if(vetor[j]<vetor[menor]){
                    menor = j;
                }
            }
            temp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = temp;

            System.out.println("\nPasso: " +i);
            for(int k=0; k<vetor.length; k++){
                System.out.print(vetor[k] + " ");
            }
        }
    }
}
