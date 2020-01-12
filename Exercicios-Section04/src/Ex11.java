import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int numero, resto1, resto2, resto3, soma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número: ");
		numero = teclado.nextInt();
		
		if(numero >= 100 && numero < 1000) {
			resto1 = numero%10;
			numero = numero/10;
			resto2 = numero%10;
			numero = numero/10;
			resto3 = numero%1000;
			soma = resto1 + resto2 + resto3;
			System.out.println(soma + "(" + resto3 + " + " + resto2 + " + " + resto1 + ")");
			
		}else if(numero < 100 && numero >= 10){
			resto1 = numero%10;
			numero = numero/10;
			resto2 = numero%100;
			soma = resto1 + resto2;
			System.out.println(soma + "(" + resto2 + " + " + resto1 + ")");
		}else if(numero < 10 && numero > 0) {
			resto1 = numero%10;
			soma = resto1;
			System.out.println(soma + "(" + resto1 + ")");
		}else {
			System.out.println("Número inválido!");
		}
		
		teclado.close();
	}

}
