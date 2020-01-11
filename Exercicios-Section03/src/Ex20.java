import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		float Kg, Lb;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Sua massa em kg: ");
		Kg = Float.parseFloat(teclado.nextLine());
		
		Lb = Kg/0.45f;
		
		System.out.println("Sua massa em libras seria: " + Lb + "lb");
		teclado.close();
	}

}
