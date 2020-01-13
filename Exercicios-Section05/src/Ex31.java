
public class Ex31 {

	public static void main(String[] args) {
		int i = 1;
		float s = 0, numero = 1;
		
		for(i = 1; i <= 99; i++) {
			
			if(i % 2 != 0) {
				s += i/numero;
				numero++;
			}
		}
		
		System.out.println("S = " + s);
	}

}
