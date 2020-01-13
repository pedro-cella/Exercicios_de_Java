import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N;
		
		System.out.print("Insira um valor para N: ");
		N = teclado.nextInt();
		if(N%2 != 0) {
			System.out.println("Número não é par!");
			teclado.close();
			return;
		}else if(N < 0) {
			System.out.println("Número não é positivo!");
			teclado.close();
			return;
		}
		
		for(int i = 0; i <= N; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		teclado.close();
	}

}
