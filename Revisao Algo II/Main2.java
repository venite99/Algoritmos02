import java.util.Scanner;

public class Main2 {

    public static int contarConsoantes(String s) {
        int contador = 0;
		for(int i = 0; i < s.length(); i++){
			char letra = s.charAt(i);
			
			if(!(letra == 'a' ||letra == 'e' ||letra == 'i' ||letra == 'o' ||letra == 'u')){
				contador++;
			}
		}
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        System.out.print(contarConsoantes(palavra));
    }
}