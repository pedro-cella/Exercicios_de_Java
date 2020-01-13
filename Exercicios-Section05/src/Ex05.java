import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, soma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um numero: ");
			numero = teclado.nextInt();
			soma += numero;
		}
		
		System.out.println("Soma: " + soma);
		
		teclado.close();
	}

}
