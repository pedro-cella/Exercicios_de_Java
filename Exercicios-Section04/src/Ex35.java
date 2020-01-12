import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, ano;
		
		System.out.println("Digite uma data: ");
		
		System.out.print("Dia: ");
		dia = teclado.nextInt();
		
		System.out.print("Mês: ");
		mes = teclado.nextInt();
		if(mes > 12 || mes < 1) {
			System.out.println("Dia inexistente");
			teclado.close();
			return;
		}
		
		System.out.print("Ano: ");
		ano = teclado.nextInt();
		
		if(mes == 1) {
			if(dia > 0 && dia <= 31) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 2 && ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
			if(dia > 0 && dia <= 29) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 2 && ano % 400 != 0 || ano % 4 != 0 && ano % 100 != 0 || ano % 4 != 0 && ano % 100 == 0 || ano % 4 == 0 && ano % 100 == 0) {
			if(dia > 0 && dia <= 28) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 3) {
			if(dia > 0 && dia <= 31) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 4) {
			if(dia > 0 && dia < 30) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 5) {
			if(dia > 0 && dia <= 31) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 6) {
			if(dia > 0 && dia < 30) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 7) {
			if(dia > 0 && dia <= 31) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 8) {
			if(dia > 0 && dia <= 31) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 9) {
			if(dia > 0 && dia < 30) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 10) {
			if(dia > 0 && dia < 30) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 11) {
			if(dia > 0 && dia < 30) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}else if(mes == 12) {
			if(dia > 0 && dia <= 31) {
				System.out.println("Data válida");
			}else {
				System.out.println("Dia inexistente");
			}
		}
		
		teclado.close();
	}

}
