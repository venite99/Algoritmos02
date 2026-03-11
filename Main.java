//Faça um programa em Java que leia dois números inteiros A e B (com A <= B) e calcule a soma de todos os números pares existentes no intervalo [A, B].
//Se não houver nenhum número par, a soma deve ser 0.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
		System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();
		int soma = 0;
		
		for(int i = a; i <=b; i++){
			if(i % 2 ==0){
				soma +=i;
			}
		}
		System.out.println("A soma dos pares entre A e B é: " + soma );
    
    }
}
