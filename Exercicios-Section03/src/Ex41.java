import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		float hora, total;
		int carga;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor da hora trabalhada: ");
		hora = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Horas trabalhadas: ");
		carga = teclado.nextInt();
		
		total = (carga*hora) + ((carga*hora)*0.1f);
		
		System.out.println("Valor a ser pago ao funcionário: " + "R$" + total);
		teclado.close();
	}

}
