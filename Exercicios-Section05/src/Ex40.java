import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, maior = 0, menor = 10000;
		
		System.out.println("Insira um número: ");
		numero = teclado.nextInt();
		
		if(numero < menor && numero >= 0) {
			menor = numero;
		}else if(numero > maior && numero >= 0) {
			maior = numero;
		}
		
		while(numero >= 0) {
		
			System.out.println("Insira um número: ");
			numero = teclado.nextInt();
			
			if(numero < menor && numero >= 0) {
				menor = numero;
			}else if(numero > maior && numero >= 0) {
				maior = numero;
			}
			
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		teclado.close();
	}

}
