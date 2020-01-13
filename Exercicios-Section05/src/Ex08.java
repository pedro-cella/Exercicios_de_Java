import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int maior = 0, menor = 1000;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Insira o valor " + (i+1) + ": ");
			numero = teclado.nextInt();
			if(numero > maior) {
				maior = numero;
			}
			if(numero < menor) {
				menor = numero;
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	
		teclado.close();
	}
}
