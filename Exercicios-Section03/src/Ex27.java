import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		double H, M2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da área em hectares: ");
		H = Double.parseDouble(teclado.nextLine());
		
		M2 = H * 10000;
		
		System.out.println("O valor da área em metros quadrados é: " + M2 + "m2");
		teclado.close();
	}
}
