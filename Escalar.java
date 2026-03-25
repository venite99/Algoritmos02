package Correcao;
import java.util.Scanner;

public class Escalar {

    
    public static int produtoEscalar(int[] a, int[] b, int tamanho) {
      
    	int soma = 0;
    	for(int x=0; x<tamanho; x++) {
    		soma += a[x] * b[x];
    	}
    	
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int resultado = produtoEscalar(a, b, n);
        System.out.println(resultado);

        sc.close();
    }
}