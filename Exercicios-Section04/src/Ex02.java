import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		float numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = Float.parseFloat(teclado.nextLine());
		
		if(numero >= 0) {
			System.out.println("A raiz quadrada do numero é " + Math.sqrt(numero));
		}else {
			System.out.println("O número é inválido");
		}
		
		teclado.close();
	}
}
