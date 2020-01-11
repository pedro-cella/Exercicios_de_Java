import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int i = 1;
		int numero;
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		for(i = 1; i <= 3 ; i++) {
			System.out.println("Escreva 3 numeros");
			System.out.println(i + " Numero: ");
			numero = teclado.nextInt();
			soma += numero;
		}
		
		System.out.println("Total: " + soma);
		teclado.close();
		
	}

}
