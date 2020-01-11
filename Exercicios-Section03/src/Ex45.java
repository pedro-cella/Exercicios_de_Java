import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		char letra;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		letra = teclado.next().charAt(0);
		
		letra = (char) (letra + 32);
		
		System.out.println("Sau letra minúscula é: " + letra);
		teclado.close();
	}

}
