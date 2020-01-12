import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int km, l, consumo;
		
		System.out.println("Digite a distância em Km: ");
		km = teclado.nextInt();
		
		System.out.println("Digite a quantidade de litros de gasolina consumidas: ");
		l = teclado.nextInt();
		
		consumo = (km/l);
		
		if(consumo < 8) {
			System.out.println("Venda o carro!");
		}else if(consumo >= 8 && consumo < 14){
			System.out.println("Econômico!");
		}else if(consumo >= 14) {
			System.out.println("Super econômico!");
		}
		
		teclado.close();
	}

}
