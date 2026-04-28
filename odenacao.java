public class odenacao {
    public static void main(String[] args) {
        
    }

    public static void insertionSort(int[] vetor){
        int aux,j;
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i+1;

            while (j >=0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
    }

     public static void selectionSort(int[] vetor){
        int menor;
        for(int i = 0; i < vetor.length -1; i++){
            menor = i;

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
