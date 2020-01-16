
public class Ex36 {

	public static void main(String[] args) {
		int soma_dos_quad = 0, quad_da_soma = 0;
		
		for(int i = 1; i<= 100; i++) {
			soma_dos_quad += (int) Math.pow(i, 2);
		}
		
		System.out.println("soma dos quadrados = " + soma_dos_quad);
		
		for(int i = 1; i<= 100; i++) {
			quad_da_soma += i;
		}
		
		quad_da_soma = (int) Math.pow(quad_da_soma, 2);
		
		System.out.println("quadrado da soma = " + quad_da_soma);
		
		System.out.println("A diferença entre a soma dos quadrados "
				+ " dos dez primeiros números naturais e o quadrado "
				+ " da soma é " + quad_da_soma + " - " + soma_dos_quad
				+ " = " + (quad_da_soma - soma_dos_quad));
	}

}
