import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		float nota1, nota2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira duas notas.");
		
		System.out.println("Nota 1: ");
		nota1 = Float.parseFloat(teclado.nextLine());
		if(nota1 < 0 || nota1 > 10) {
			System.out.println("Valor " + nota1 + " inválido!");
			teclado.close();
			return;
		}else {
			System.out.println("Nota 2: ");
			nota2 = Float.parseFloat(teclado.nextLine());
			if(nota2 < 0 || nota2 > 10) {
				System.out.println("Valor " + nota2 + " inválido!");
				teclado.close();
				return;
			}else {
				System.out.println("Média do aluno: " + (nota1+nota2)/2);
			}
		}
		
		teclado.close();
	}

}
