import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador11 = 0, contador13 = 0, contador17 = 0;
		
		System.out.println("Insira um número: ");
		numero = teclado.nextInt();
		
		for(int i = numero; i > 0; i--) {
			if(i % 11 == 0 && i != 11 && contador11 == 0) {
				contador11++;
				System.out.println("O primeiro múltiplo de 11 é " + i);
			}else if(i % 13 == 0 && i != 13 && contador13 == 0) {
				contador13++;
				System.out.println("O primeiro múltiplo de 13 é " + i);
			}else if(i % 17 == 0 && i != 17 && contador17 == 0) {
				contador17++;
				System.out.println("O primeiro múltiplo de 17 é " + i);
			}
		}
		
		teclado.close();
	}

}
