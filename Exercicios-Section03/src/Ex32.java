import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		int numero, resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escolha um número: ");
		numero = teclado.nextInt();
		
		resultado = ((3*numero)+1) + ((2*numero)-1);
		
		System.out.println("A soma do sucessor do seu triplo com o antecessor do seu dobro é: " + resultado);
		teclado.close();
	}

}
