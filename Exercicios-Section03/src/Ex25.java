import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		double M2, A;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da área em acres ");
		A = Double.parseDouble(teclado.nextLine());
		
		M2 = A * 4048.58;
		
		System.out.println("O valor da área em metros quadrados é " + M2 + "m2");
		teclado.close();

	}

}
