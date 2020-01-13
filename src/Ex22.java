import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 10, media = 0, contador = 1;
		
		while(numero >= 10 && numero <= 20) {
			System.out.print("Insira um número: ");
			numero = teclado.nextInt();
			if(numero >= 10 && numero <= 20) {
				media += numero;
				contador++;
			}else {
				contador--;
			}
		}
		
		System.out.println("Média dos números: " + (media/contador));
		
		teclado.close();
	}

}
