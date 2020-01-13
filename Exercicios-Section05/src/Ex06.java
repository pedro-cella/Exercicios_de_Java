import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, media = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			numero = teclado.nextInt();
			media += numero;
		}
		
		System.out.println("Média dos números = " + (media/10));
		
		teclado.close();
	}

}
