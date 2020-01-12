import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		numero = teclado.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("O número digitado é par!");
		}else {
			System.out.println("O número digitado é ímpar!");
		}
		
		teclado.close();
	}

}
