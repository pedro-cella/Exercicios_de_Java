import java.util.Scanner;
public class Ex47 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		float n1, n2;
		
		System.out.println("Escolha uma opção e insira o valor de dois números: ");
		System.out.println("1- Adição");
		System.out.println("2- subitração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		System.out.println("5- Sair");
		
		do {
			
			System.out.print("Opção: ");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Soma");
				System.out.println("Insira os valores: ");
				System.out.print("Número 1: ");
				n1 = teclado.nextFloat();
				
				System.out.print("Número 2: ");
				n2 = teclado.nextFloat();
				
				System.out.println("Resultado da soma: " + (n1+n2));
				break;
				
			case 2:
				System.out.println("Subração");
				System.out.println("Insira os valores: ");
				System.out.print("Número 1: ");
				n1 = teclado.nextFloat();
				
				System.out.print("Número 2: ");
				n2 = teclado.nextFloat();
				
				System.out.println("Resultado da soma: " + (n1-n2));
				break;


			case 3:
				System.out.println("Multiplicação");
				System.out.println("Insira os valores: ");
				System.out.print("Número 1: ");
				n1 = teclado.nextFloat();
				
				System.out.print("Número 2: ");
				n2 = teclado.nextFloat();
				
				System.out.println("Resultado da soma: " + (n1*n2));
				break;
				
			case 4:
				System.out.println("Divisão");
				System.out.println("Insira os valores: ");
				System.out.print("Número 1: ");
				n1 = teclado.nextFloat();
				
				System.out.print("Número 2: ");
				n2 = teclado.nextFloat();
				if(n2 == 0) {
					System.out.println("Erro! Divisão por 0");
				}else {
					System.out.println("Resultado da soma: " + (n1/n2));
				}
				break;
			
			default:
				break;
			}
			
		}while(opcao != 5);
		
		teclado.close();
	}

}
