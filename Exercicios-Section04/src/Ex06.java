import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int numero1, numero2, maior = 0, dif = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira dois números para saber qual deles é maior.");
		
		System.out.println("Primeiro número: ");
		numero1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Segundo número");
		numero2 = Integer.parseInt(teclado.nextLine());
		
		if(numero1 > numero2) {
			maior = numero1;
			dif = maior - numero2;
			System.out.println("O maior número é o " + maior
			+ " e a diferença para o menor é " + dif);
		}else {
			maior = numero2;
			dif = maior - numero1;
			System.out.println("O maior número é o " + maior
					+ " e a diferença para o menor é " + dif);
		}
		
		teclado.close();
	}

}
