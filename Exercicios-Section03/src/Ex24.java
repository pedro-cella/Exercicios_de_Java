import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		double M2, A;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da área ");
		M2 = Double.parseDouble(teclado.nextLine());
		
		A = M2 * 0.000247;
		
		System.out.println("O valor da área em acres é " + A + "acres");
		teclado.close();

	}

}
