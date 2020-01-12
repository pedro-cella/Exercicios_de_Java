import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira as notas do aluno: ");
		
		System.out.println("Nota 1:");
		nota1 = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Nota 2:");
		nota2 = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Nota 3:");
		nota3 = Float.parseFloat(teclado.nextLine());
		
		media = ((nota1*1) + (nota2*1) + (nota3*2))/(1+1+2);
		
		if(media >= 60) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		teclado.close();
	}

}
