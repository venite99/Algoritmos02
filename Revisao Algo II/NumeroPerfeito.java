import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int soma = 0;
	   for(int i = 1; i < n; i++){
		   if(n % i == 0){
			   soma += i;
		   }
	   }
	   if(soma == n){
		   System.out.println(n + " é perfeito");
		   
	   }else{
		   System.out.println(n + " não é perfeito");
	   }
    }
}