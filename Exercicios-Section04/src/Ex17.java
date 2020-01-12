import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		float maior, menor, altura;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o valor da altura, da base maior e da base menor: ");
		
		System.out.println("Altura: ");
		altura = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Base maior: ");
		maior = Float.parseFloat(teclado.nextLine());
		
		if(maior > 0) {
			System.out.println("Base menor: ");
			menor = Float.parseFloat(teclado.nextLine());
			if(menor > 0) {
				System.out.println("Área = " + ((maior + menor) * altura)/2);
			}else {
				System.out.println("Valor inválido!");
				teclado.close();
				return;
			}
		}else {
			System.out.println("Valor inválido!");
			teclado.close();
			return;
		}
		
		teclado.close();
	}

}
