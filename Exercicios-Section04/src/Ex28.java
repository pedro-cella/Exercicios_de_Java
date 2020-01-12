import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char opcao;
		int x, y, z, resultado;
		
		System.out.println("Digite os valores para calcular a média: ");
		
		System.out.println("X = ");
		x = teclado.nextInt();
		
		System.out.println("Y = ");
		y = teclado.nextInt();
		
		System.out.println("Z = ");
		z = teclado.nextInt();
		
		System.out.println("Que média gostaria de calcular: ");
		System.out.println("Opção: ");
		opcao = teclado.next().charAt(0);
		
		switch (opcao) {
		case 'a':
			System.out.println("Média Geométrica");
			resultado = (int) Math.cbrt(x*y*z);
			System.out.println("Média: " + resultado);
			break;
			
		case 'b':
			System.out.println("Média Ponderada");
			resultado = (x+(2*y)+(3*z))/6;
			System.out.println("Média: " + resultado);
			break;
			
		case 'c':
			System.out.println("Média Harmônica");
			resultado = 1/((1/x)+(1/y)+(1/z));
			System.out.println("Média: " + resultado);
			break;
			
		case 'd':
			System.out.println("Média Ponderada");
			resultado = (x+y+z)/3;
			System.out.println("Média: " + resultado);
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		teclado.close();
	}

}
