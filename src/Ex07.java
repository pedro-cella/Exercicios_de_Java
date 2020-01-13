import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, media = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Número " + (i+1) + ": ");
			numero = teclado.nextInt();
			if(numero < 0) {
				i--;
			}else {
				media += numero;
			}
		}
		
		System.out.println("Média = " + (media/10));
		
		teclado.close();
	}

}
