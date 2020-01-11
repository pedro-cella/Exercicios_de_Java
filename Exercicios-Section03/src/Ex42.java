import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		float salario, total;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Salário do funcionário: ");
		salario = Float.parseFloat(teclado.nextLine());
		
		total = (salario + (salario*0.05f) - (salario*0.07f));
		
		System.out.println("O valor total do salário do funcionário é: " + "R$" + total);
		teclado.close();
	}

}
