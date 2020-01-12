import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float nota;
		int faltas;
		
		System.out.print("Digite a nota do aluno: ");
		nota = Float.parseFloat(teclado.nextLine());
		
		System.out.print("Insira a quantidade de flatas do aluno: ");
		faltas = teclado.nextInt();
		
		if(nota > 9.0f && nota <= 10.0f && faltas <= 20) {
			System.out.println("Conceito: A");
		}else if(nota > 9.0f && nota <= 10.0f && faltas > 20) {
			System.out.println("Conceito: B");
		}else if(nota >= 7.5f && nota <= 8.9f && faltas <= 20) {
			System.out.println("Conceito: B");
		}else if(nota >= 7.5f && nota <= 8.9f && faltas > 20) {
			System.out.println("Conceito: C");
		}else if(nota >= 5.0f && nota <= 8.9 && faltas <= 20) {
			System.out.println("Conceito: C");
		}else if(nota >= 5.0f && nota <= 8.9 && faltas > 20) {
			System.out.println("Conceito: D");
		}else if(nota >= 4.0f && nota <= 4.9 && faltas <= 20) {
			System.out.println("Conceito: D");
		}else if(nota >= 4.0f && nota <= 4.9 && faltas > 20) {
			System.out.println("Conceito: E");
		}else if(nota >= 0.0f && nota <= 3.9 && faltas <= 20) {
			System.out.println("Conceito: E");
		}else if(nota >= 0.0f && nota <= 3.9 && faltas > 20) {
			System.out.println("Conceito: E");
		}
		
		teclado.close();
	}

}
