public class Fatorial{
public static void main(String[] args){
	int result = 1;
	int fatorial = 5;
	
	for(int i = 1; i <= fatorial; i++){
		result = result*i;
	}
	System.out.println(result);
}
}