import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float C, K;
		
		K = Float.parseFloat(teclado.nextLine());
		C = K - 273.15f;
		
		System.out.println(C);
		teclado.close();
	}

}
