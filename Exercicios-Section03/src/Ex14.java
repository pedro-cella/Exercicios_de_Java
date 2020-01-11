import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		float G, R;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ângulo em graus: ");
		G = Float.parseFloat(teclado.nextLine());
		
		R = G*(3.14f)/180f;
		
		System.out.println("Ângulo em radianos: " + R);
		teclado.close();
		

	}

}
