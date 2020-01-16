import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador = 0;
		
		System.out.print("Insira um valor maior que 1: ");
		numero = teclado.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				contador++;
			}
		}
		
		if(contador == 2) {
			System.out.println("O número " + numero + " é primo");
		}else {
			System.out.println("O número " + numero + " não é primo");
		}
		
		teclado.close();
	}

}
