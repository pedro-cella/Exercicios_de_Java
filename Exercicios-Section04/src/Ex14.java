import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nota do Trabalho do Laboratório: ");
		nota1 = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Nota da Avaliação Semestral: ");
		nota2 = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Nota do Exame Final: ");
		nota3 = Float.parseFloat(teclado.nextLine());
		
		media = ((nota1*2) + (nota2*3) + (nota3*5))/(2+3+5);
		
		if(media >= 0 && media <= 2.9) {
			System.out.println("Reprovado");
		}else if(media >= 3 && media <= 4.9) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Aprovado");
		}
		
		teclado.close();
	}

}
