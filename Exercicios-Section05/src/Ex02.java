
public class Ex02 {

	public static void main(String[] args) {
		int j = 0, i, k = 0;
		
		System.out.println("Usando for");
		for(i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("Usando while");
		while(j != 101) {
			System.out.print(j + " ");
			j++;
		}
		
		System.out.println();
		
		System.out.println("Usando do while");
		do {
			System.out.print(k + " ");
			k++;
		}while(k != 101);
	}

}
