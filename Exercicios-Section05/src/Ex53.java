import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		int n;
		int numero = 1;
		
		System.out.println("insira um valor: ");
		n = teclado.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i == 1) {
				System.out.println(numero);
				numero++;
			}else if(i > 1) {
				for(int j = i; j > 0; j--) {
					System.out.print(numero + " ");
					numero++;
				}
				System.out.println();
			}
		}
		
		teclado.close();
	}

}
