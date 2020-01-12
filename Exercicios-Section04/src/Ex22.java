import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		int idade, temp_serv;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Idade do trabalhador: ");
		idade = teclado.nextInt();
		
		System.out.println("Tempo de serviço: ");
		temp_serv = teclado.nextInt();
		
		if(idade >= 65 || temp_serv >= 30 || (idade >= 60 && temp_serv >= 25)) {
			System.out.println("Pode se aposentar");
		}else {
			System.out.println("Não pode se aposentar");
		}
		
		teclado.close();
	}

}
