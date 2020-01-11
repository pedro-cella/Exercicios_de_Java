import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float C, F;
		
		C = Float.parseFloat(teclado.nextLine());
		F = C*(9.0f/5.0f) + 32.0f;
		
		System.out.println(F);
		teclado.close();

	}

}
