import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		float numero;
		
		Scanner teclado = new Scanner(System.in);
		
		numero = Float.parseFloat(teclado.nextLine());
		
		System.out.println(numero);
		
		teclado.close();
	}

}
