import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = teclado.nextInt();
		
		if(numero % 3 == 0) {
			System.out.println("Número divisível por 3");
		}else if(numero % 5 == 0) {
			System.out.println("Número divisível por 5");
		}else if(numero % 3 != 0 || numero % 5 != 0) {
			System.out.println("Número não divisível nem por 3 nem por 5");
		}
		
		teclado.close();
	}

}
