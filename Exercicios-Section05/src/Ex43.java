import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade, media = 0, contador = 0;
		
		System.out.println("Insira uma idade: ");
		idade = teclado.nextInt();
		
		while(idade > 0) {
			media += idade;
			contador++;
			
			System.out.println("Insira uma idade: ");
			idade = teclado.nextInt();
		}
		
		System.out.println("A média das idades é: "+ (media/contador));
		
		teclado.close();
	}

}
