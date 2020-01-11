import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		float P, CM;
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Comprimento em polegadas: ");
		P = Float.parseFloat(teclado.nextLine());
		
		CM = P * 2.54f; 
		
		System.out.println("O comprimento em centímetros é: " + CM + "cm");
		teclado.close();
	}

}