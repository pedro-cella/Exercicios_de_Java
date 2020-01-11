import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		float valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		valor = Float.parseFloat(teclado.nextLine());
		
		System.out.println("O total a pagar com desconto de 10%: " + "R$" + (valor - (valor*0.1f)));
		System.out.println("O total das parcelas é de: " + "R$" + valor/3);
		System.out.println("Comissão do vendedor: " + "R$" + ((valor - (valor*0.1f))*0.05));
		System.out.println("Comissão do vendedor com parcelamento: " + "R$" + valor*0.05f);
		
		teclado.close();
	}

}
