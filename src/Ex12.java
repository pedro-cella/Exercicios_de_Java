import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N;
		
		System.out.print("Insira um valor para N: ");
		N = teclado.nextInt();
		
		for(int i = N; i >= 0 ; i--) {
			System.out.print(i + " ");
		}
		
		teclado.close();
	}

}
