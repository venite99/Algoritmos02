import java.util.Scanner;

public class ContaPalavra {

    public static int contarPalavras(String frase) {
        int contador = 1;
		
		for(int i = 0; i < frase.length(); i++){
			if(frase.charAt(i) == ' '){
				contador++;
			}
		}
		return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        System.out.println(contarPalavras(frase));
    }
}