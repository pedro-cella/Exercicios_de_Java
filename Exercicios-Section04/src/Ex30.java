import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("digite os números: ");
		System.out.print("Digite o primeiro número: ");
		numero1 = teclado.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = teclado.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = teclado.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
			System.out.println(numero3 + ", " + numero2 + ", " + numero1);
		}else if(numero1 < numero2 && numero1 > numero3 && numero2 > numero3) {
			System.out.println(numero3 + ", " + numero1 + ", " + numero2);
		}else if(numero1 > numero2 && numero1 < numero3 && numero2 < numero3) {
			System.out.println(numero2 + ", " + numero1 + ", " + numero3);
		}else if(numero1 < numero2 && numero1 < numero3 && numero2 < numero3) {
			System.out.println(numero1 + ", " + numero2 + ", " + numero3);
		}else if(numero1 < numero2 && numero1 < numero3 && numero2 > numero3) {
			System.out.println(numero1 + ", " + numero3 + ", " + numero2);
		}else if(numero1 > numero2 && numero1 > numero3 && numero2 < numero3) {
			System.out.println(numero2 + ", " + numero3 + ", " + numero1);
		}
		
		teclado.close();
	}

}
