import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		numero = teclado.nextInt();
		
		if(numero < 0) {
			System.out.println("Número inválido");
		}else {
			System.out.println("O logaritmo do número é " + Math.log(numero));
		}
		
		teclado.close();
	}
}
