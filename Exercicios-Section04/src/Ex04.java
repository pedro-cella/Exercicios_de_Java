import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		float numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = Float.parseFloat(teclado.nextLine());
		
		if(numero > 0) {
			System.out.println("Esse número é positivo!");
			System.out.println("O quadrado desse número é: " + Math.pow(numero, 2) 
			+ " e sua raiz quadrada é: " + Math.sqrt(numero));
		}else {
			System.out.println("Desculpe, mas o número digitado é inválido.");
		}
		
		teclado.close();
	}

}
