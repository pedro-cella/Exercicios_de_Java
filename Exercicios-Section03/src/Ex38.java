import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		float salario, aumento;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Salário do Funcionário: ");
		salario = Float.parseFloat(teclado.nextLine());
		
		aumento = salario + (salario*0.25f);
		
		System.out.println("Seu salário já com o aumento é de: " + "R$" + aumento);
		teclado.close();
	}

}
