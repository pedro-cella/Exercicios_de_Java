import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		int dias;
		float liquido;
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Quantidade de dias trabalhados: ");
		dias = teclado.nextInt();
		
		liquido = (dias*30f) - ((dias*30f)*0.08f);
		
		System.out.println("O total líquido é:" + liquido);
		teclado.close();
	}

}
