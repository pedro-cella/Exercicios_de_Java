
public class Ex49 {

	public static void main(String[] args) {
		float salario = 1000.00f;
		
		float Carlos = salario;
		float Joao = salario/3;
		int meses = 0;
		
		while(Joao < Carlos) {
			Carlos = Carlos + (Carlos*0.02f);
			Joao = Joao + (Joao*0.05f);
			
			meses++;
		}
		
		if(Joao == Carlos) {
			System.out.println("João demoraria " + meses + " meses para se igualar a Carlos");
		}else if(Joao > Carlos) {
			System.out.println("João demoraria " + meses + " meses para se ultrapassar a Carlos");
		}
	}

}
