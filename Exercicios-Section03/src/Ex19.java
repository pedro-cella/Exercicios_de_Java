import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args){
		
		float L, M;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Volume em litros: ");
		L = Float.parseFloat(teclado.nextLine());
		
		M = L/1000;
		
		System.out.println("O volume em metros cúbicos é " + M + "m3");
		teclado.close();
		
	}

}
