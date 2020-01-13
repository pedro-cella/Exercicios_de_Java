import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, soma1 = 0, soma2 = 0, soma3 = 0;
		
		System.out.println("Insira o número: ");
		n = teclado.nextInt();
		
		for(int i = 1; i <= n; i++) {
			soma1 += i;
			soma2 += ((2*i)-1);
			if(i % 2 != 0) {
				soma3 += ((2*i)-1);
			}
		}
		
		System.out.println("Soma1 = " + soma1);
		System.out.println("Soma2 = " + soma2);
		System.out.println("Soma3 = " + soma3);
		teclado.close();
	}

}
