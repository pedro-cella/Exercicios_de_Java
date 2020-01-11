import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		float M, K;
		Scanner teclado = new Scanner(System.in);
		
		M = Float.parseFloat(teclado.nextLine());
		K = M*3.6f;
		
		System.out.println(K);
		teclado.close();

	}

}
