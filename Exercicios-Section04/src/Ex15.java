import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira um número entre 1 e 7: ");
		opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda-feira");
			break;
			
		case 3:
			System.out.println("Terça-feira");
			break;
			
		case 4:
			System.out.println("Quarta-feira");
			break;
			
		case 5:
			System.out.println("Quinta-feira");
			break;
			
		case 6:
			System.out.println("Sexta-feira");
			break;
			
		case 7:
			System.out.println("Sábado");
			break;
			
		default:
			System.out.println("Valor inválido");
			break;
		}
		
		teclado.close();
	}

}
