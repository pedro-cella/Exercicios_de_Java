import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, soma = 0, multi = 1;
		
		System.out.println("Insira dois números para calcular: ");
		System.out.println("a) a soma dos números pares no intervalo dos dois números");
		System.out.println("b) a multiplicação dos números ímpares no intervalo desses números");
		
		System.out.println("Insira o primeiro número: ");
		numero1 = teclado.nextInt();
		
		System.out.println("Insira o segundo número: ");
		numero2 = teclado.nextInt();
		
		for(int i = numero1; i <= numero2; i++) {
			if(i % 2 == 0) {
				soma += i;
			}else {
				multi *= i;
			}
		}
		
		System.out.println("A soma dos números pares é de: " + soma);
		System.out.println("A multiplicação dos números ímpares é de: " + multi);
		
		teclado.close();
	}

}
