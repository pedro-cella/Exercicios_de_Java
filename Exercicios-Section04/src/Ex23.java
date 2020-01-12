import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		int ano;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Validador de ano bissexto");
		
		System.out.println("Insira um ano qualquer: ");
		ano = teclado.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println("É ano bissexto!");
		}else if(ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("É ano bissexto!");
		}else {
			System.out.println("Não é ano bissexto!");
		}
		
		teclado.close();
	}

}
