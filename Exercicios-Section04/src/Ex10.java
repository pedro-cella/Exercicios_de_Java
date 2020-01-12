import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		float altura;
		String sexo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira sua altura: ");
		altura = Float.parseFloat(teclado.nextLine());
		if(altura <= 0) {
			System.out.println("Valor inválido!");
			teclado.close();
			return;
		}
		
		System.out.println("Insira o sexo: ");
		sexo = teclado.nextLine();
		
		if(sexo.equals("Masculino") || sexo.equals("M")) {
			System.out.println("Seu peso ideal: " + ((72.7*altura) - 58));
		}else if(sexo.contentEquals("Feminino") || sexo.equals("F")) {
			System.out.println("Seu peso ideal: " + ((62.1*altura) - 44.7));
		}else {
			System.out.println("Valor inválido!");
		}
		
		teclado.close();
	}

}
