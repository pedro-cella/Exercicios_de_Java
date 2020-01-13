
public class Ex10 {

	public static void main(String[] args) {
		int soma = 0, numero = 0, contador = 0;
		
		while(contador != 51) {
			
			System.out.println(numero);
			
			if(numero % 2 == 0) {
				soma += numero;
				contador++;
			}
			numero++;
		}
		
		System.out.println("A soma dos 50 primeiros números pares é: " + soma);
	}

}
