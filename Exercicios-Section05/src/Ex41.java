import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float R1, R2, R;
		
		do {
			
			System.out.println("Resistor 1: ");
			R1 = Float.parseFloat(teclado.nextLine());
			System.out.println("Resistor 2: ");
			R2 = Float.parseFloat(teclado.nextLine());
			
			R = (R1*R2)/(R1+R2);
			
			System.out.println("R = " + R);

		}while(R != 0 && R1 != 0 && R2 != 0);
	
		teclado.close();
	}

}
