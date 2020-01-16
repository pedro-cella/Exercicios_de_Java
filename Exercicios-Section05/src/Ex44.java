import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, fibonacci = 0, ant = 0, i = 0;
		
		System.out.println("Insira um número: ");
		numero = teclado.nextInt();
		
		while(fibonacci < numero) { 
			if (i == 1) {
				fibonacci = 1;
	            ant = 0;
	        } else {
	        	fibonacci += ant;
	            ant = fibonacci - ant;
	        }
			
			System.out.print(fibonacci + " ");
			i++;
		}
		
		teclado.close();
	}

}
