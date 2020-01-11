import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double numero;
		
		numero = teclado.nextDouble();
		
		System.out.println(numero/5);
		teclado.close();
		
	}

}
