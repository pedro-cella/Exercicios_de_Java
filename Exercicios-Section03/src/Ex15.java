import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		float R, G;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o ângulo em radianos: ");
		R = Float.parseFloat(teclado.nextLine());
		
		G = R * 180f/3.14f;
		
		System.out.println("O ângulo em graus é: " + G);
		teclado.close();
	}

}