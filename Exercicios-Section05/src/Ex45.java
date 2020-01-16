import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		float valor;
		
		System.out.println("Escolha uma opção: ");
		System.out.println("1- Converter de km/h para m/s");
		System.out.println("2- Converter de m/s para km/h");
		System.out.println("3 - Finalizar programa");
		
		do {
			System.out.print("Opção: ");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Insira o valor que deseja converter: ");
				valor = teclado.nextFloat();
				
				valor = valor/3.6f;
				System.out.println("Valor: " + valor + "m/s");
				break;
				
			case 2:
				System.out.print("Insira o valor que deseja converter: ");
				valor = teclado.nextFloat();
				
				valor = valor*3.6f;
				System.out.println("Valor: " + valor + "km/h");
				break;

			default:
				break;
			}
			
		}while(opcao != 3);
	
		teclado.close();
	}

}
