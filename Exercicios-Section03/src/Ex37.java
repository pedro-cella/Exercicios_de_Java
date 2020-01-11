import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		float valor, desconto;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor do produto: ");
		valor = Float.parseFloat(teclado.nextLine());
		
		desconto = valor - (valor*0.12f);
		
		System.out.println("O valor do produto com 12% de desconto fica: " + desconto);
		teclado.close();
	}

}
