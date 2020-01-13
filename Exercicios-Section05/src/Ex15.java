import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N;
		
		System.out.print("Insira um valor para N: ");
		N = teclado.nextInt();
		if(N%2 == 0) {
			System.out.println("Número não é ímpar!");
			teclado.close();
			return;
		}else if(N < 0) {
			System.out.println("Número não é positivo!");
			teclado.close();
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
		teclado.close();
	}

}
