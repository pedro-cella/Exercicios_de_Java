
public class Ex25 {

	public static void main(String[] args) {
		int soma = 0;
		
		for(int i = 0; i < 1000; i++) {
			if(i % 3 != 0 || i % 5 != 0) {
				soma += i;
			}
		}
		
		System.out.println("A soma nos números não múltiplos de 3 e 5 é: " + soma);
	}

}
