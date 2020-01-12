import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float peso;
		
		System.out.print("Insira seu peso: ");
		peso = Float.parseFloat(teclado.nextLine());
		
		if(peso <= 18.5f) {
			System.out.println("Abaixo do Peso");
		}else if(peso >= 18.6f && peso <= 24.9f) {
			System.out.println("Saudável");
		}else if(peso >= 25.0f && peso <= 29.9f) {
			System.out.println("Peso em excesso");
		}else if(peso >= 30.0f && peso <= 34.9f) {
			System.out.println("Obesidade Grau 1");
		}else if(peso >= 35.0f && peso <= 39.9f) {
			System.out.println("Obesidade Grau 2 (severa)");
		}else if(peso >= 40.0f) {
			System.out.println("Obesidade Grau 3 (mórbida)");
		}
		
		teclado.close();
	}
}
