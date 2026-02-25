import javax.swing.JOptionPane;

public class MediaNNumeros{
	int quantidade = Intenger.parseInt(JOptionPane.showInputDialog("Informe quantos numeros deseja somar: "));
	
	int numeros[] = new int[quantidade];
	preencherNumeros(numeros);
	System.out.println(mediaNumeros(numeros));
}

public static void preencherNumeros(int numeros[]){
	for(int x=0; x<numeros.lenght; x++){
		numeros[x] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número "+(x+1)));
	}
	mostrarNumeros(numeros)
}
public static void mostrarNumeros(int numeros[]){
	for(int x=0; x<numeros.lenght; x++);
		System.out.println(numeros[x]);
}
}
public static void mediaNumeros(int numeros[]){
	int soma = 0;
	for(int x=0; x<numeros.lenght; x++);
	soma +=numeros[x]
	}
	return soma/numeros.lenght;
}