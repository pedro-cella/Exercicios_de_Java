import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo, quantidade;
		float valor;
		
		System.out.print("Digite a quantidade: ");
		quantidade = teclado.nextInt();
		
		System.out.print("Digite o código dor produto: ");
		codigo = teclado.nextInt();
		
		switch (codigo) {
		case 100:
			valor = (1.20f * quantidade);
			System.out.println("Total: " + "R$" + valor);
			break;
		
		case 101:
			valor = (1.30f * quantidade);
			System.out.println("Total: " + "R$" + valor);
			break;
			
		case 102:
			valor = (1.50f * quantidade);
			System.out.println("Total: " + "R$" + valor);
			break;
			
		case 103:
			valor = (1.20f * quantidade);
			System.out.println("Total: " + "R$" + valor);
			break;
			
		case 104:
			valor = (1.70f * quantidade);
			System.out.println("Total: " + "R$" + valor);
			break;
			
		case 105:
			valor = (2.20f * quantidade);
			System.out.println("Total: " + "R$" + valor);
			break;
			
		case 106:
			valor = (1.00f * quantidade);
			System.out.println("Total: " + "R$" + valor);
			break;
			
		default:
			break;
		}
		
		teclado.close();
	}

}
