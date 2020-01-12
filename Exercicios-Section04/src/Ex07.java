import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira dois números para saber qual deles é o maior.");
		
		System.out.println("Primeiro número: ");
		numero1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Segundo número: ");
		numero2 = Integer.parseInt(teclado.nextLine());
		
		if(numero1 > numero2) {
			System.out.println("O maior número é o " + numero1);
		}else if(numero1 == numero2) {
			System.out.println("Números iguais");
		}else {
			System.out.println("O maior número é o " + numero2);
		}
		
		teclado.close();
		
	}

}
