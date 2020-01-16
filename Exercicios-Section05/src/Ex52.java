import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int saque, cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0;
		
		System.out.println("Quanto deseja sacar: ");
		saque = teclado.nextInt();
		
		while(saque != 0) {
			if(saque % 100 == 0) {
				saque -= 100;
				cem++;
			}else if(saque % 50 == 0) {
				saque -= 50;
				cinquenta++;
			}else if(saque % 20 == 0) {
				saque -= 20;
				vinte++;
			}else if(saque % 10 == 0) {
				saque -= 10;
				dez++;
			}else if(saque % 5 == 0) {
				saque -= 5;
				cinco++;
			}else if(saque % 2 == 0) {
				saque -= 2;
				dois++;
			}else if(saque % 1 == 0) {
				saque -= 1;
				um++;
			}else if(saque == 0) {
				break;
			}

		}
		
		System.out.println("O saque virá com: ");
		System.out.println(cem + " nota(s) de R$100,00");
		System.out.println(cinquenta + " nota(s) de R$50,00");
		System.out.println(vinte + " nota(s) de R$20,00");
		System.out.println(dez + " nota(s) de R$10,00");
		System.out.println(cinco + " nota(s) de R$5,00");
		System.out.println(dois + " nota(s) de R$2,00");
		System.out.println("e " + um + " nota(s) de R$1,00");
	
		teclado.close();
	}

}
