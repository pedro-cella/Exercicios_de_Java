import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		float M, K;
		Scanner teclado = new Scanner(System.in);

		K = Float.parseFloat(teclado.nextLine());
		M = K/3.6f;
		
		System.out.println(M);
		teclado.close();
	}

}
