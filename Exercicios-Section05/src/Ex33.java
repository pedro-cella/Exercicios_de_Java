import java.util.Scanner; 

public class Ex33 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i, j, k = 0, contador = 0;
		
		System.out.print("Dê o valor de n: ");
		n = teclado.nextInt();
		
		System.out.print("Dê o valor de i: ");
		i = teclado.nextInt();
		while(i == 0) {
			System.out.print("Insira um valor válido para i: ");
			i = teclado.nextInt();
		}
		
		System.out.print("Dê o valor de j: ");
		j = teclado.nextInt();
		while(j == 0) {
			System.out.print("Insira um valor válido para j: ");
			j = teclado.nextInt();
		}
		
//		for(int k = 0; k < n; k++) {
//			if(k % i == 0) {
//				System.out.println(k + ", ");
//			}else if(k % j == 0) {
//				System.out.println(k + ", ");
//			}else if(k % i == 0 && k % j == 0) {
//				System.out.println(k + ", ");
//			}
//		}
		
		while(contador != n) {
			if(k % i == 0) {
				if(contador == n-1) {
					System.out.println(k + ".");
				}else {
					System.out.print(k + ", ");
				}
			}else if(k % j == 0) {
				if(contador == n-1) {
					System.out.println(k + ".");
				}else {
					System.out.print(k + ", ");
				}			
			}else if(k % i == 0 && k % j == 0) {
				if(contador == n-1) {
					System.out.println(k + ".");
				}else {
					System.out.print(k + ", ");
				}
			}else if(k % i != 0 || k % j != 0 || k % i != 0 && k % j != 0) {
				contador--;
			}
			contador++;
			k++;
		}
		
		teclado.close();
	}

}
