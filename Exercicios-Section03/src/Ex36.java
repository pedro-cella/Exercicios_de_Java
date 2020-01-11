import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		float altura, raio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Altura do cilindro: ");
		altura = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Raio do cilindro: ");
		raio = Float.parseFloat(teclado.nextLine());
		
		System.out.println("O volume do cilindro é: " + (3.141592f * (raio*raio) * altura));
		teclado.close();
	}

}
