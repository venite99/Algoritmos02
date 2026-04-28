package Selection;
public class SelectionSort{
    public static void main(String[] args) {
        int vetor[] = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        System.out.println("Vetor desordenado:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]);
        }
            //Selection Sort
            int posicao_Menor, aux; 
            for(int i = 0; i < vetor.length; i++){
                posicao_Menor=i;
                for(int j=i+1; j<vetor.length; j++){
                    if(vetor[j] < vetor[posicao_Menor]){
                        posicao_Menor = j;
                    }
                }
                aux = vetor[posicao_Menor];
                vetor[posicao_Menor]=vetor[i];
                vetor[i]=aux;
            }


        System.out.println("\nVetor ordenado:");
        for(int i = 0; i < vetor.length; i++){
        System.out.print(vetor[i]);
        }
    }
}

