import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		int opcao, numero1, numero2, maior, menor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escolha a opção: ");
		System.out.println("1- Soma de 2 números.");
		System.out.println("2- Diferença entre 2 números(maior pelo menor).");
		System.out.println("3- Produto entre 2 números.");
		System.out.println("4- Divisão entre 2 números (o denominador não pode ser zero)");
		System.out.println("Opção: ");
		opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Opção 1: ");
			System.out.println("Insira o primeiro número");
			numero1 = teclado.nextInt();
			System.out.println("Insira o segundo número");
			numero2 = teclado.nextInt();
			
			System.out.println("Resultado: " + (numero1+numero2));
			break;
			
		case 2:
			System.out.println("Opção 2: ");
			System.out.println("Insira o primeiro número: ");
			numero1 = teclado.nextInt();
			System.out.println("Insira o segundo número: ");
			numero2 = teclado.nextInt();
			
			if(numero1 > numero2) {
				maior = numero1;
				menor = numero2;
			}else {
				maior = numero2;
				menor = numero1;
			}
			
			System.out.println("Resultado: " + (maior - menor));
			break;
			
		case 3:
			System.out.println("Opção 3: ");
			System.out.println("Insira o primeiro número");
			numero1 = teclado.nextInt();
			System.out.println("Insira o segundo número");
			numero2 = teclado.nextInt();
			
			System.out.println("Resultado: " + (numero1*numero2));
			break;
			
		case 4:
			System.out.println("Opção 4: ");
			System.out.println("Insira o primeiro número");
			numero1 = teclado.nextInt();
			System.out.println("Insira o segundo número");
			numero2 = teclado.nextInt();
			if(numero2 == 0) {
				System.out.println("Erro! Divisão por zero");
				teclado.close();
				return;
			}else {
				System.out.println("Resultado: " + (numero1/numero2));
				break;
			}
			
		default:
			System.out.println("Operação indisponível");
			break;
		}
		
		teclado.close();
		
	}

}
