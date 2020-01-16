import java.util.Random;
import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);

		int numero, contador = 0, valor;
		
		valor = gerador.nextInt(1000);
		
		System.out.println("Acerte o valor do número aleatório!");
		System.out.println("O número está entre 1 e 1000");
		
		System.out.println("Qual é o número gerado?");
		numero = teclado.nextInt();
		
		while(numero != valor) {
			
			System.out.println("Você errou!");
			if(numero > valor) {
				System.out.println("Você informou um número maior que o número gerado!");
			}else if(numero < valor) {
				System.out.println("Você informou um número menor que o número gerado!");
			}
			
			contador++;
			
			System.out.println("Qual é o número gerado?");
			numero = teclado.nextInt();
		}
		
		if(contador == 0) {
			System.out.println("Parabéns você acertou de primeira!!");
			System.out.println("O número gerado era o " + numero);
		}else{
			System.out.println("Parabéns você acertou!!");
			System.out.println("Você tentou " + contador + " vezes");
			System.out.println("O número gerado era o " + numero);
		}
		
		teclado.close();
	}

}
