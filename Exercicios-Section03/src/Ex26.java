import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		double M2, H;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da área em metros quadrados ");
		M2 = Double.parseDouble(teclado.nextLine());
		
		H = M2 * 0.0001;
		
		System.out.println("O valor da área em hectares é " + H + "hectares");
		teclado.close();

	}

}
