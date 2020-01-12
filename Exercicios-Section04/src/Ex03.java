import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		float numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = Float.parseFloat(teclado.nextLine());
		
		if(numero > 0) {
			System.out.println("Esse número é positivo!");
			System.out.println("Logo sua raiz quadrada é " + Math.sqrt(numero));
		}else {
			System.out.println("Esse número é negativo!");
			System.out.println("Logo o quadrado desse número é " + Math.pow(numero, 2));
		}
		
		teclado.close();
	}

}
