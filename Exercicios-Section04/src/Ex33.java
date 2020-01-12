import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float preco;
		
		System.out.print("Preço: ");
		preco = Float.parseFloat(teclado.nextLine());
		
		if(preco < 50.0f) {
			preco = preco + (preco*0.05f);
			System.out.println("Novo preço: " + preco);
		}else if(preco >= 50 && preco < 100) {
			preco = preco + (preco*0.1f);
			System.out.println("Novo preço: " + preco);
		}else if(preco >= 100) {
			preco = preco + (preco*0.15f);
			System.out.println("Novo preço: " + preco);
		}
		
		teclado.close();
	}

}
