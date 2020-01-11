import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		float circulo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite  raio do círculo: ");
		circulo = Float.parseFloat(teclado.nextLine());
		
		System.out.println("A área do cículo é: " + (3.141592*(circulo*circulo)));
		teclado.close();
	}

}
