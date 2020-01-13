import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, soma = 0;
		
		System.out.print("Digite um número: ");
		numero = teclado.nextInt();
		
		for(int i = numero; i > 0; i--) {
			
			if(i == numero) {
				i--;
			}else if(numero % i == 0) {
				if(i == 1) {
					System.out.print(i);
				}else {
					System.out.print(i + " + ");
				}
				soma += i;
			}
		}
		
		System.out.println();
		System.out.println("A soma dos divisores do número " + numero + " é " + soma);
		teclado.close();
	}

}
