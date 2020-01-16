
public class Ex50 {

	public static void main(String[] args) {
		float Chico, Ze;
		int anos = 0;
		
		Chico = 1.50f;
		Ze = 1.10f;
		
		while(Ze < Chico) {
			Chico = Chico + 0.02f;
			Ze = Ze + 0.03f;
			anos++;
		}
		
		System.out.println("Zé demoraria " + anos + " anos para ser maior que Chico");
	}

}
