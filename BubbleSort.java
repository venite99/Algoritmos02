import java.util.Arrays;

public class BubbleSort{
	public static void main(String args[]){
		int vetor[] = {6,5,4,3,2,1};
		System.out.println(Arrays.toString(vetor));
		ordenar(vetor);
		System.out.println(Arrays.toString(vetor));
}

	private static void ordenar(int vetor[]){
		int contador = 0;
		boolean trocou = false;
		for(int x=0; x<vetor.length - 1; x++){
			for(int y=0; y<vetor.length - 1 - x; y++){
				contador++;
				if(vetor[y] > vetor[y+1]){
					int aux = vetor[y];
					vetor[y] = vetor[y+1];
					vetor[y+1] = aux;
					trocou = true;
				}
			}
			if(!trocou)break;
		}
	}
}