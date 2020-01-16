
public class Ex38 {

	public static void main(String[] args) {
		int a, b, c;
		int soma = 1000;
		
		
		
		for(a = 1; a <= soma/3; a++) {
			for(b = a + 1; b <= soma/2; b++) {
				c = soma - a - b;
				if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2));
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("c = " + c);
				System.out.println();
			}
		}
	}

}
