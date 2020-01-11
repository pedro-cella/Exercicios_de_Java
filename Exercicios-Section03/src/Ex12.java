import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		float M, K;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Distância em milhas:");
		M = Float.parseFloat(teclado.nextLine());
		K = 1.61f*M;
		
		System.out.println("Distância em quilômetros: " + K);
		teclado.close();
	}

}
