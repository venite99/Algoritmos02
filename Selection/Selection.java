package Selection;


public class Selection{
 public static void main(String[] args) {
    
    int[] vetor = {8,6,9,7,4,2,1};
    selectionSort(vetor);

    System.out.println("Vetor ordenado: ");
    for(int i=0; i<vetor.length; i++){
        System.out.println(vetor[i]);
    }
}
public static void selectionSort(int[] vetor){
    for(int i=0; i<vetor.length -1; i++){
        int menor = i;

        for(int j = i+1; j < vetor.length; j++){
            if(vetor[j] < vetor[menor]){
                menor = j;
            }
        }

        int temp = vetor[i];
        vetor[i] = vetor[menor];
        vetor[menor] = temp;
    }

}
}