import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int venda;
		float comissao;
		
		System.out.print("Valor da venda: ");
		venda = teclado.nextInt();
		
		if(venda >= 100000) {
			comissao = 700.00f + (float) (venda*0.16f);
			System.out.println("Comissão: " + comissao);
		}else if(venda < 100000 && venda >= 80000) {
			comissao = 650.00f + (float) (venda*0.14f);
			System.out.println("Comissão: " + comissao);
		}else if(venda < 80000 && venda >= 60000) {
			comissao = 600.00f + (float) (venda*0.14f);
			System.out.println("Comissão: " + comissao);
		}else if(venda < 60000 && venda >= 40000) {
			comissao = 550.00f + (float) (venda*0.14f);
			System.out.println("Comissão: " + comissao);
		}else if(venda < 40000 && venda >= 20000) {
			comissao = 500.00f + (float) (venda*0.14f);
			System.out.println("Comissão: " + comissao);
		}else if(venda < 20000) {
			comissao = 400.00f + (float) (venda*0.14f);
			System.out.println("Comissão: " + comissao);
		}
		
		teclado.close();
	}

}
