import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		float K, M;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Distância em quilômetros: ");
		K = Float.parseFloat(teclado.nextLine());
		M = K/1.61f;
		
		System.out.println("Distância em milhas: " + M);
		teclado.close();
		
	}

}
