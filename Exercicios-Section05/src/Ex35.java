import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int inicial, fim, soma = 0;
		
		System.out.println("Digire o valor inicial e o valor final do interalo: ");
		
		System.out.print("Valor inicial: ");
		inicial = teclado.nextInt();
		
		System.out.print("Valor final: ");
		fim = teclado.nextInt();
		
		if(inicial > fim) {
			System.out.println("Intervalo de valores inválido");
			teclado.close();
			return;
		}else {
			for(int i = inicial; i <= fim; i++) {
				if(i % 2 != 0) {
					soma += i;
				}
			}
		}
		
		System.out.println("Soma dos ímpares neste intervalo: " + soma);
		
		teclado.close();
	}

}
