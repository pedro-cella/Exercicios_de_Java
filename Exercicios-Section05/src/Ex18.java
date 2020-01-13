import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int quantidade, maior = 0, numero, contador = 1;
		
		System.out.print("Quantidade de números a ser lido: ");
		quantidade = teclado.nextInt();
				
		for(int i = 1; i <= quantidade; i++) {
			System.out.print("Insira o número: ");
			numero = teclado.nextInt();
			if(numero > maior) {
				maior = numero;
			}else if(numero == maior) {
				contador++;
			}
		}
		
		System.out.println("O maior número é o " + maior);
		System.out.println("Que foi lido " + contador + " vezes");
		
		teclado.close();
	}

}
