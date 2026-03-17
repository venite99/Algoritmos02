public class Multiplos {

    public static int somaMultiplos3ou5(int n) {
        int soma = 0;
		
		for(int i = 0; i < n; i++){
			if(i % 3 ==0 || i % 5 ==0){
				soma = soma + i;
			}
		}
	return soma;
    }
	public static void main(String[] args){
		int n = 10;
		
		int res = somaMultiplos3ou5(n);
		System.out.println(res);
	}
}