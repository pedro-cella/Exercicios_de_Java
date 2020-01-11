import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args){
		
		float L, M;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Volume em metros cúbicos: ");
		M = Float.parseFloat(teclado.nextLine());
		
		L = 1000 * M;
		
		System.out.println("O volume em litros é " + L + "L");
		teclado.close();
		
	}

}
