import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0, contador = 0, pares = 0;
		
		while(numero != 1000) {
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			if(numero % 2 == 0) {
				pares++;
			}
			
			if(numero == 1000) {
				contador--;
				pares--;
			}
			
			contador++;
		}
		
		System.out.println("Quantidade de números lidos: " + contador);
		System.out.println("Quantidade de números pares: " + pares);
		
		teclado.close();
	}

}
