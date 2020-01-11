import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		float CM, P;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Comprimento em centímetros: ");
		CM = Float.parseFloat(teclado.nextLine());
		
		P = CM/2.54f;
		
		System.out.println("Comprimento em polegadas: " + P + "p");
		teclado.close();
	}

}
