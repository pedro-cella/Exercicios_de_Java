import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		int opcao;
		float numero1 = 0, numero2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Que operação matemática gostaria de realizar: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Soma");
			System.out.println("Insira o valor do primeiro número: ");
			numero1 = teclado.nextFloat();
			System.out.println("Insira o valor do segundo número: ");
			numero2 = teclado.nextFloat();
			
			System.out.println("A soma desses dois valores é " + (numero1 + numero2));
			break;

		case 2:
			System.out.println("Subtração");
			System.out.println("Insira o valor do primeiro número: ");
			numero1 = teclado.nextFloat();
			System.out.println("Insira o valor do segundo número: ");
			numero2 = teclado.nextFloat();
			
			System.out.println("A subtração desses dois valores é " + (numero1 - numero2));
			break;
			
		case 3:
			System.out.println("Multiplicação");
			System.out.println("Insira o valor do primeiro número: ");
			numero1 = teclado.nextFloat();
			System.out.println("Insira o valor do segundo número: ");
			numero2 = teclado.nextFloat();
			
			System.out.println("A multiplicação desses dois valores é " + (numero1 * numero2));
			break;
			
		case 4:
			System.out.println("Divisão");
			System.out.println("Insira o valor do primeiro número: ");
			numero1 = teclado.nextFloat();
			System.out.println("Insira o valor do segundo número: ");
			numero2 = teclado.nextFloat();
			if(numero2 == 0) {
				System.out.println("ERRO! Divisão por zero");
				break;
			}
			
			System.out.println("A divisão desses dois valores é " + (numero1 / numero2));
			break;
			
		default:
			System.out.println("Operação inválida");
			break;
		}
		
		teclado.close();
	}

}
