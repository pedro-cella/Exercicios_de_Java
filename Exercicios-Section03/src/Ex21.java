import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		float Kg, Lb;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Sua massa em kg: ");
		Lb = Float.parseFloat(teclado.nextLine());
		
		Kg = Lb*0.45f;
		
		System.out.println("Sua massa em quilogramas seria: " + Kg + "kg");
		teclado.close();
	}

}
