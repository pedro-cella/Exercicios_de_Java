import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		float lado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		lado = Float.parseFloat(teclado.nextLine());
		
		System.out.println("A área do quadrado é: " + (lado*lado));
		teclado.close();
	}

}
