import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		float a, b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cateto a: ");
		a = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Cateto b: ");
		b = Float.parseFloat(teclado.nextLine());
		
		System.out.println("A hipotenusa é: " + Math.sqrt((a*a) + (b*b)));
		teclado.close();
	}

}
