import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		double real, cot, total;
		Scanner cambio = new Scanner(System.in);
		
		System.out.println("Quantos reais gostaria de trocar?");
		real = Double.parseDouble(cambio.nextLine());
		
		System.out.println("Qual a cotação do dólar?");
		cot = Double.parseDouble(cambio.nextLine());
		
		total = real/cot;
		
		System.out.printf("Você receberá " + "$" + total);
		cambio.close();
	}

}
