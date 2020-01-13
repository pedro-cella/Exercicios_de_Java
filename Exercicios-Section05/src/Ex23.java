import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, divisor = 2;
		
		System.out.println("Insira um número positivo: ");
		numero = teclado.nextInt();
		while(numero < 0) {
			System.out.println("Erro! número inválido");
			System.out.println("Insira um número positivo: ");
			numero = teclado.nextInt();
		}
		
		while(numero != 0) {
			
			if(numero%divisor == 0) {
				System.out.println(divisor + " é um divisor do número " + numero);
				numero = numero/divisor;
			}else {
				divisor++;
			}
		}
		
		teclado.close();
	}

}
