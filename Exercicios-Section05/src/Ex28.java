import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, fat = 1;;
		float e = 0;
		
		System.out.print("Insira um número: ");
		n = teclado.nextInt();
		
		e += 1;
		
		for(int i = 1; i <= n; i++) {
			e += (float) 1/(fat *= i);
		}
		
		System.out.println("E = " + e);
		
		teclado.close();
	}

}
