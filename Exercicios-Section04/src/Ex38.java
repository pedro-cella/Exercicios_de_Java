import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float salario;
		int temp_serv;
		
		System.out.print("Digite seu salário atual: ");
		salario = Float.parseFloat(teclado.nextLine());
		
		System.out.print("Digite o tempo de serviço do funcionário: ");
		temp_serv = teclado.nextInt();
		
		if(salario <= 500.00f && temp_serv < 1) {
			salario = salario + (salario*0.25f);
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Sem Bônus");
			
		}else if(salario <= 500.00f && temp_serv >= 1 && temp_serv <= 3) {
			salario = salario + (salario*0.25f);
			salario = salario + 100.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 100.00);
			
		}else if(salario <= 500.00f && temp_serv >= 4 && temp_serv <= 6) {
			salario = salario + (salario*0.25f);
			salario = salario + 200.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 200.00);
			
		}else if(salario <= 500.00 && temp_serv >= 7 && temp_serv <= 10) {
			salario = salario + (salario*0.25f);
			salario = salario + 300.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 300.00);
			
		}else if(salario <= 500.00f && temp_serv > 10) {
			salario = salario + (salario*0.25f);
			salario = salario + 500.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 500.00);
			
		}else if(salario > 500.00f && salario <= 1000.00f && temp_serv < 1) {
			salario = salario + (salario*0.20f);
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Sem Bônus");
			
		}else if(salario > 500.00f && salario <= 1000.00f && temp_serv >= 1 && temp_serv <= 3) {
			salario = salario + (salario*0.20f);
			salario = salario + 100.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 100.00);
			
		}else if(salario > 500.00f && salario <= 1000.00f && temp_serv >= 4 && temp_serv <= 6) {
			salario = salario + (salario*0.20f);
			salario = salario + 200.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 200.00);
			
		}else if(salario > 500.00f && salario <= 1000.00 && temp_serv >= 7 && temp_serv <= 10) {
			salario = salario + (salario*0.20f);
			salario = salario + 300.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 300.00);
			
		}else if(salario > 500.00f && salario <= 1000.00f && temp_serv > 10) {
			salario = salario + (salario*0.20f);
			salario = salario + 500.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 500.00);
			
		}else if(salario > 1000.00f && salario <= 1500.00f && temp_serv < 1) {
			salario = salario + (salario*0.15f);
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Sem Bônus");
			
		}else if(salario > 1000.00f && salario <= 1500.00f && temp_serv >= 1 && temp_serv <= 3) {
			salario = salario + (salario*0.15f);
			salario = salario + 100.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 100.00);
			
		}else if(salario > 1000.00f && salario <= 1500.00f && temp_serv >= 4 && temp_serv <= 6) {
			salario = salario + (salario*0.15f);
			salario = salario + 200.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 200.00);
			
		}else if(salario > 1000.00f && salario <= 1500.00 && temp_serv >= 7 && temp_serv <= 10) {
			salario = salario + (salario*0.15f);
			salario = salario + 300.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 300.00);
			
		}else if(salario > 1000.00f && salario <= 1500.00f && temp_serv > 10) {
			salario = salario + (salario*0.15f);
			salario = salario + 500.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 500.00);
			
		}else if(salario > 1500.00f && salario <= 2000.00f && temp_serv < 1) {
			salario = salario + (salario*0.10f);
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Sem Bônus");
			
		}else if(salario > 1500.00f && salario <= 2000.00f && temp_serv >= 1 && temp_serv <= 3) {
			salario = salario + (salario*0.10f);
			salario = salario + 100.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 100.00);
			
		}else if(salario > 1500.00f && salario <= 2000.00f && temp_serv >= 4 && temp_serv <= 6) {
			salario = salario + (salario*0.10f);
			salario = salario + 200.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 200.00);
			
		}else if(salario > 1500.00f && salario <= 2000.00 && temp_serv >= 7 && temp_serv <= 10) {
			salario = salario + (salario*0.10f);
			salario = salario + 300.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 300.00);
			
		}else if(salario > 1500.00f && salario <= 2000.00f && temp_serv > 10) {
			salario = salario + (salario*0.10f);
			salario = salario + 500.00f;
			System.out.println("Salário reajustado: " + salario);
			System.out.println("Bônus de R$" + 500.00);
			
		}else if(salario > 2000.00f && temp_serv < 1) {
			System.out.println("Sem reajuste");
			System.out.println("Sem Bônus");
			
		}else if(salario > 2000.00f && temp_serv >= 1 && temp_serv <= 3) {
			System.out.println("Sem reajuste");
			salario = salario + 100.00f;
			System.out.println("Bônus de R$" + 100.00);
			
		}else if(salario > 2000.00f && temp_serv >= 4 && temp_serv <= 6) {
			System.out.println("Sem reajuste");
			salario = salario + 200.00f;
			System.out.println("Bônus de R$" + 200.00);
			
		}else if(salario > 2000.00f && temp_serv >= 7 && temp_serv <= 10) {
			System.out.println("Sem reajuste");
			salario = salario + 300.00f;
			System.out.println("Bônus de R$" + 300.00);
			
		}else if(salario > 2000.00f && temp_serv > 10) {
			System.out.println("Sem reajuste");
			salario = salario + 500.00f;
			System.out.println("Bônus de R$" + 500.00);
		}
		
		teclado.close();
	}

}
