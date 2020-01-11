import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		int num1, num2, num3, soma;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		num2 = teclado.nextInt();
		
		System.out.println("Digite o teceiro valor: ");
		num3 = teclado.nextInt();
		
		soma = (num1*num1) + (num2*num2) + (num3*num3);
		
		System.out.println("A soma dos quadrados desses números é: " + soma);
		teclado.close();

	}

}
