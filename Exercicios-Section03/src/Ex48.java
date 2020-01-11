import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		int segundos;
		Scanner teclado = new Scanner(System.in);
		segundos = teclado.nextInt();
		
		System.out.println("Horas: " + (segundos/3600) + " Minuto: " + (segundos/60) + " Segundos: " + segundos);
		teclado.close();
	}
}
