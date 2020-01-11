import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escolha um número: ");
		numero = teclado.nextInt();
		
		System.out.println("Antecessor: " + (numero-1));
		System.out.println("Sucessor: " + (numero+1));
		teclado.close();
	}

}
