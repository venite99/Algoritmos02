package ordenacao;

public class SelectionSort {
	
public static void main(String[] args) {
	int vetor[] = {5,4,3,2,1};
	
	
}
	public static void ordenar(int vetor[]) {
		for(int x=0; x<vetor.length -1; x++) {
			int indiceMenorElemento = x;
			for(int y=x+1; y<vetor.length; y++) {
				if(vetor[indiceMenorElemento]> vetor[y]) {
					indiceMenorElemento = y;
				}
			}
			if(indiceMenorElemento != x) {
				int aux = vetor[indiceMenorElemento];
				vetor[indiceMenorElemento] = vetor[x];
				vetor[x] = aux;
			}
		}
	}

}
