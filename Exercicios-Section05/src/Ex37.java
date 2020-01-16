
public class Ex37 {

	public static void main(String[] args) {
		int alta_ordem, baixa_ordem;
		int soma = 0;
		
		for(int i = 1000; i <= 9999; i++) {
	
			alta_ordem = i/100;
			baixa_ordem = i%100;
			
			soma = alta_ordem + baixa_ordem;
			
			if(Math.pow(soma, 2) == i) {
				System.out.println("Número " + i + " possui a propriedade.");
			}
		}
		
	}

}
