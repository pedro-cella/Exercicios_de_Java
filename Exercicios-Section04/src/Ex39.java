import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float custo;
		
		System.out.print("Custo de fábrica: ");
		custo = Float.parseFloat(teclado.nextLine());
		
		if(custo <= 12000.00f) {
			custo = custo + (custo*0.05f);
			System.out.println("Custo para o consumidor: " + custo);
		}else if(custo > 12000.00f && custo <= 25000.00f) {
			custo = custo + (custo*0.1f) + (custo*0.15f);
			System.out.println("Custo para o consumidor: " + custo);
		}else if(custo > 25000.00) {
			custo = custo + (custo*0.15f) + (custo*0.2f);
			System.out.println("Custo para o consumidor: " + custo);
		}
		
		teclado.close();
	}

}
