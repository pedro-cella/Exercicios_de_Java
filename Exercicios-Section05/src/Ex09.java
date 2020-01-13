import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N;
		
		System.out.print("Quanto vale N? ");
		N = teclado.nextInt();
		
		for(int i = 0; i < N; i++) {
			if(i % 2 != 0) {
				System.out.println(i + " é ímpar");
			}
		}
		
		teclado.close();
	}

}
