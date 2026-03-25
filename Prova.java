package Correcao;
import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = 0;
    for(int i = a; i <= b; i++) {
    	if(i % 2 ==0) {
    		soma = soma + i;
    	}
    }
    System.out.println("A soma dos pares entre "+a+" e "+b+" é "+soma);
    }
}
