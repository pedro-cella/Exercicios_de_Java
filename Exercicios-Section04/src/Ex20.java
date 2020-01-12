import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		int A, B, C;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = teclado.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = teclado.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = teclado.nextInt();
		
		if((A < (B + C)) && (B < (A + C)) && (C < (A + B))) {
			if((A == B) && (A == C) && (B == C)) {
				System.out.println("Triângulo Equilátero");
			}else if((A == B) || (A == C) || (B == C)) {
				System.out.println("Triângulo Isósceles");
			}else if((A != B) && (A != C) && (B != C)) {
				System.out.println("Triângulo Escaleno");
			}
		}else {
			System.out.println("Os valores apresentados não podem ser valores do lado de um triângulo");
		}
		
		teclado.close();
	}

}
