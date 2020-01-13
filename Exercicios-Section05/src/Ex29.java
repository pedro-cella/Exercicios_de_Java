
public class Ex29 {

	public static void main(String[] args) {
		float s = 0, divisor;
		int fat = 1;
		
		for(int i = 1; i <= 5; i++) {
			divisor = i+1;
			if(divisor % 2 == 0) {
				s += (float) i/(fat *= divisor);
			}
		}
		
		System.out.println("S = " + s);
	}

}
