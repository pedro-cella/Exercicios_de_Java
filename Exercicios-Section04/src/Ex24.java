import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		String estado;
		float valor = 10;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		valor = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Digite o estado de destino: ");
		estado = teclado.nextLine();
		
		if(estado.equals("Minas Gerais") || estado.equals("MG")) {
			valor = valor + (valor*0.07f);
			System.out.println("Preço final: " + valor);
		}else if(estado.equals("São Paulo") || estado.equals("SP")) {
			valor = valor + (valor*0.12f);
			System.out.println("Preço final: " + valor);
		}else if(estado.equals("Rio de Janeiro") || estado.equals("RJ")){
			valor = valor + (valor*0.15f);
			System.out.println("Preço final: " + valor);
		}else if(estado.equals("Mato Grosso do Sul") || estado.equals("MS")) {
			valor = valor + (valor*0.08f);
			System.out.println("Preço final: " + valor);
		}else {
			System.out.println("Estado inválido!");
		}
		
		teclado.close();
	}

}
