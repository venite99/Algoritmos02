public class NumeroReverso{
public static void main(String[] args){
	int num = 1234;
	int invertido = 0;
	
	while(num > 0){
		int digito = num % 10;
		invertido = invertido * 10 + digito;
		num = num/10;
	}
	System.out.println(invertido);
}
}