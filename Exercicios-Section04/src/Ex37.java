import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hc,hs, mc, ms;
		int entrada, saida;
		float total;
		
		System.out.println("Insira o horário de chegada: ");
		entrada = teclado.nextInt();
		hc = entrada/100;
		mc = entrada%100;
		
		System.out.println("Insira o horário de saida: ");
		saida = teclado.nextInt();
		hs = saida/100;
		ms = saida%100;
		
		if((saida - entrada) <= 60) {
			total = (saida-entrada)*1;
			System.out.println("Hora de chegada: " + hc + ":" + mc);
			System.out.println("Hora de saida: " + hs + ":" + ms);
			System.out.println("Total a pagar: R$" + total);
		}else if((saida - entrada) >= 60 && (saida - entrada) <= 120) {
			total = (saida-entrada)*2;
			System.out.println("Hora de chegada: " + hc + ":" + mc);
			System.out.println("Hora de saida: " + hs + ":" + ms);
			System.out.println("Total a pagar: R$" + total);
		}else if((saida-entrada) > 120 && (saida-entrada) <= 180) {
			total = (float) ((saida-entrada)*4.20);
			System.out.println("Hora de chegada: " + hc + ":" + mc);
			System.out.println("Hora de saida: " + hs + ":" + ms);
			System.out.println("Total a pagar: R$" + total);
		}else if((saida-entrada) > 180 && (saida-entrada) <= 240) {
			total = (float) ((saida-entrada)*5.60);
			System.out.println("Hora de chegada: " + hc + ":" + mc);
			System.out.println("Hora de saida: " + hs + ":" + ms);
			System.out.println("Total a pagar: R$" + total);
		}else if((saida-entrada) > 240) {
			total = (saida-entrada)*10;
			System.out.println("Hora de chegada: " + hc + ":" + mc);
			System.out.println("Hora de saida: " + hs + ":" + ms);
			System.out.println("Total a pagar: R$" + total);
		}else if(entrada > saida){
			total = (saida-entrada)*48;
			System.out.println("Hora de chegada: " + hc + ":" + mc);
			System.out.println("Hora de saida: " + hs + ":" + ms);
			System.out.println("Total a pagar: R$" + total);
		}
		
		teclado.close();
		
	}

}
