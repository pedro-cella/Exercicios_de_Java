import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double C, K;
		
		C  = Double.parseDouble(teclado.nextLine());
		K = C + 273.15;
		
		System.out.println(K);
		teclado.close();
		
	}

}
