import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		float a, b, c;
		float x, x1, x2, delta;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a equação de segundo grau: ");
		System.out.println("a = ");
		a = Float.parseFloat(teclado.nextLine());
		System.out.println("b = ");
		b = Float.parseFloat(teclado.nextLine());
		System.out.println("c = ");
		c = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Sua equação ficou: ");
		if(a < 0 || b < 0 || c < 0) {
			System.out.println("(" + a + ")x² + (" + b + ")x + (" + c + ")");
		}else {
			System.out.println(a + "x² + " + b + "x + " + c);
		}
		
		delta = (float) (Math.sqrt(b) - (4.0f * a * c));
		
		if(delta < 0) {
			System.out.println("Não existe raiz");
		}else if(delta == 0) {
			x = (float) (((-b) + Math.sqrt(delta))/2*a);
			System.out.println("Raiz: " + x);
			System.out.println("Raiz única");
		}else{
			x1 = (float) (((-b) + Math.sqrt(delta))/2*a);
			x2 = (float) (((-b) - Math.sqrt(delta))/2*a);
			System.out.println("Raiz1: " + x1);
			System.out.println("Raiz2: " + x2);
		}
		
		teclado.close();
	}

}
