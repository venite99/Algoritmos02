import javax.swing.JOptionPane

public class SomarNumeros{
	public static void main(String args[]){
		
	int numero1 = Intenger.parseInt(JOptionPane.showInputDialog("Informe 0 1º número: "));
	
		int numero2 = Intenger.parseInt(JOptionPane.showInputDialog("Informe o 2º número: "));
		
		int numero3 = Intenger.parseInt(JOptionPane.showInputDialog("Informe o 3º número: "));
		 System.out.println (media(numero1, numero2, numero3));
	}
	
	//private static void somar(int numero1, int numero2){
	//	System.out.println((numero1+numero2));}
	
	//private static int somar (int numero1, int numero2, int numero3){
	//	return numero1 + numero2 + numero3;}
	
	private static void int media(int numero1, int numero2, int numero3){
		return (numero1 + numero2 + numero3)/3;
	}
}

