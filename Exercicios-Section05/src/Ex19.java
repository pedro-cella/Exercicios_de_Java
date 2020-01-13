import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, resto;
		
		System.out.print("Escreva um número entre 100 e 999: ");
		numero = teclado.nextInt();
		
		for(int i = 0; i < 3; i++) {//435
			if(i == 0) {
				resto = numero/100;
				System.out.print(resto + " ");
			}else if(i == 1) {
				resto = numero/10;
				resto = resto%10;
				System.out.print(resto + " ");
			}else {
				resto = numero%10;
				System.out.println(resto + " ");
			}
		}
		
		
		teclado.close();
	}

}
