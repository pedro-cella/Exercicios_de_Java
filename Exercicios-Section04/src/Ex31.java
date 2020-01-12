import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float altura;
		int peso;
		
		System.out.print("Insira sua altura: ");
		altura = Float.parseFloat(teclado.nextLine());
		
		System.out.print("Insira seu peso: ");
		peso = teclado.nextInt();
		
		if(altura < 1.20f && peso <= 60) {
			System.out.println("A");
		}else if(altura < 1.20f && peso > 60 && peso <= 90) {
			System.out.println("D");
		}else if(altura < 1.20f && peso > 90) {
			System.out.println("G");
		}else if(altura >= 1.20f && altura <= 1.70f && peso <= 60) {
			System.out.println("B");
		}else if(altura >= 1.20 && altura <= 1.70 && peso > 60 && peso <= 90) {
			System.out.println("E");
		}else if(altura >= 1.20f && altura <= 1.70f && peso > 90) {
			System.out.println("H");
		}else if(altura > 1.70f && peso <= 60) {
			System.out.println("C");
		}else if(altura > 1.70f && peso > 60 && peso <= 90) {
			System.out.println("F");
		}else if(altura > 1.70 && peso > 90) {
			System.out.println("I");
		}
		
		teclado.close();
	}

}
