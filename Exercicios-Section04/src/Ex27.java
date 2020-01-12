import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a idade do nadador: ");
		idade = teclado.nextInt();
		
		if(idade > 5 && idade <= 7) {
			System.out.println("Sua categoria é: Infantil A");
		}else if(idade > 8 && idade <= 10) {
			System.out.println("Sua categoria é: Infantil B");
		}else if(idade > 11 && idade <= 13) {
			System.out.println("Sua categoria é: Juvenil A");
		}else if(idade > 14 && idade <= 17) {
			System.out.println("Sua categoria é: Juvenil B");
		}else if(idade > 18) {
			System.out.println("Sua categoria é: Sênior");
		}else {
			System.out.println("Sem categoria");
		}
		
		teclado.close();
	}

}
