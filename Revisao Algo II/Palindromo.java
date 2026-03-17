public class Palindromo{
	public static void main(String[] args){
		String palavra = "ana";
		boolean ehPalindromo = true;
		
		for(int i = 0; i < palavra.length() /2; i++){
			if(palavra.charAt(i) != palavra.charAt(palavra.length() -1 - i)){
				ehPalindromo = false;
				break;
			}
		}
		if(ehPalindromo){
			System.out.println("Sim");
		} else{
			System.out.println("Não");
		}
}
}