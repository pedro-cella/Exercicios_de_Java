import java.util.Scanner;
public class Ex42 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Insira um número positivo: ");
		numero = teclado.nextInt();
		
		while(numero > 0) {
			System.out.println("Quadrado do número: " + Math.pow(numero, 2));
			System.out.println("Cubo do número: " + Math.pow(numero, 3));
			System.out.println("Raiz quadrada do número: " + Math.sqrt(numero));
			
			System.out.println();
			
			System.out.println("Insira um número positivo: ");
			numero = teclado.nextInt();
		}
		
		teclado.close();
	}

}
