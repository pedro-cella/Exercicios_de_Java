import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		float altura, usuario;
		int degraus;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Altura do degrau: ");
		altura = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Altura que o usuario deseja chegar: ");
		usuario = Float.parseFloat(teclado.nextLine());
		
		degraus = (int) (usuario/altura);
		
		System.out.println("O usuario precisara andar " + degraus + "degraus");
		teclado.close();
	}

}
