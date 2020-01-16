
public class Ex51 {

	public static void main(String[] args) {
		float salario;
		float aumento;
		
		salario = 2000;
		aumento = 0.015f;
	
		System.out.println("Salário em 1995: " + salario);
		
		for(int i = 1997; i <= 2019; i++) {
			aumento = aumento*2;
			System.out.println(aumento);
			salario = 2000 + (2000*aumento);
			System.out.println(salario);
		}
		
		System.out.println("Salário em 2019: " + salario);
	}

}
