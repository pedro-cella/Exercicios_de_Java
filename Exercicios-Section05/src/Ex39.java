import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float altura, base, area;
		
		System.out.println("Calcular a área de um triângulo: ");
		
		System.out.println("Insira altura: ");
		altura = Float.parseFloat(teclado.nextLine());
		while(altura <= 0) {
			if(altura == 0 || altura < 0) {
				System.out.println("Valor inválido, por favor insira um valor positivo");
				System.out.print("Novo valor: ");
				altura = Float.parseFloat(teclado.nextLine());
			}
		}
		System.out.println("Insira base: ");
		base = Float.parseFloat(teclado.nextLine());
		while(base <= 0) {
			if(base == 0 || base < 0) {
				System.out.println("Valor inválido, por favor insira um valor positivo");
				System.out.print("Novo valor: ");
				base = Float.parseFloat(teclado.nextLine());
			}
		}
		
		area = (base*altura)/2;
		
		System.out.println("A área do triângulo é: " + area);
		
		teclado.close();
		
	}

}
