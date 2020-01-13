import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, soma = 0;
		
		System.out.println("Digite um valor para n: ");
		n = teclado.nextInt();
		
		for(int i = 0; i <= n; i++) {
			soma += i;
		}
		
		System.out.println("Soma do n primeiros números naturais: " + soma);
		
		teclado.close();
	}

}
