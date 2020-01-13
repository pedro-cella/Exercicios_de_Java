import java.util.Random;
import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner teclado = new Scanner(System.in);
		int n, d1, d2;
		
		System.out.print("Insira a quantidade de vezes que os dados irão rolar: ");
		n = teclado.nextInt();
		
		for(int i = 0; i < n; i++) {
			d1 = rand.nextInt(7);
			d2 = rand.nextInt(7);
			
			System.out.println("Os dados deram: ");
			System.out.println("D1 = " + d1);
			System.out.println("D2 = " + d2);
			
			if(d1 > d2) {
				System.out.println("O dado 1 deu um valor maior que o dado 2!");
			}else if(d1 < d2) {
				System.out.println("O dado 2 deu um valor maior que o dado 1!");
			}else if(d1 == d2){
				System.out.println("Os dados deram o mesmo valor!");
			}
		}
		
		teclado.close();
	}

}
