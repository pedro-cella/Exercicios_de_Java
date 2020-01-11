import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		float J, M;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Comprimento em metros: ");
		M = Float.parseFloat(teclado.nextLine());
		
		J =  M/0.91f;
				
		System.out.println("Comprimento em jardas: " + J + "j");
		teclado.close();
		
	}

}
