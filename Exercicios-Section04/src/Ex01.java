import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int numero1, numero2, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois números e descubra qual deles é o maior.");
		
		System.out.println("Digite o primeiro número: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = teclado.nextInt();
		
		if(numero1 > numero2) {
			maior = numero1;
		}else {
			maior = numero2;
		}
		
		System.out.println("O maior número é o " + maior);
		teclado.close();
	}

}
