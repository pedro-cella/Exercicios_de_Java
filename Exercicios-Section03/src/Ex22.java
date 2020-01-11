import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		float J, M;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Comprimento em jardas: ");
		J = Float.parseFloat(teclado.nextLine());
		
		M =  0.91f*J;
				
		System.out.println("COmprimento em metros: " + M + "m");
		teclado.close();
		
	}

}
