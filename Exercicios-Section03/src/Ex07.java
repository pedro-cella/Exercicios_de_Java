import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float C, F;
		
		F = Float.parseFloat(teclado.nextLine());
		C = 5.0f * (F - 32.0f)/9.0f;
		
		System.out.println(C);
		teclado.close();

	}

}
