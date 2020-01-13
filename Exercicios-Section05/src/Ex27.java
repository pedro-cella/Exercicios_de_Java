import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		float h = 0;
		
		System.out.print("Insira um número: ");
		n = teclado.nextInt();
		
		for(int i = 1; i <= n; i++) {
			h += (float) 1/i;
		}
		
		System.out.println("H(n) = " + h);
		
		teclado.close();
	}

}
