import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite as notas: ");
		
		System.out.println("Nota 1: ");
		nota1 = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Nota 2: ");
		nota2 = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Nota 3: ");
		nota3 = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Nota 4: ");
		nota4 = Float.parseFloat(teclado.nextLine());
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A média das notas é: " + media);
		teclado.close();

	}

}
