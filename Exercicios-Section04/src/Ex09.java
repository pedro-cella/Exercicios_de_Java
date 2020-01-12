import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		float salario, prestacao;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o salario do funcionario: ");
		salario = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Digite a prestacao: ");
		prestacao = Float.parseFloat(teclado.nextLine());
		if(prestacao > (salario*0.2)) {
			System.out.println("Empréstimo não concedido");
		}else {
			System.out.println("Empréstimo concedido");
		}
		
		teclado.close();
	}

}
