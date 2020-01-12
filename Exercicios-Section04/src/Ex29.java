import java.util.Random; 
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		int a, b, resposta, soma;
		
		a = gerador.nextInt(100);
		b = gerador.nextInt(100);
		
		System.out.println("Qual é a soma de " + a + " + " + b);
		soma = a + b;
		System.out.print("Digite sua resposta: ");
		resposta = teclado.nextInt();
		if(resposta == soma) {
			System.out.println("Resposta correta!");
		}else {
			System.out.println("Resposta Errada! A resposta correta é: " + soma);
		}
		
		a = gerador.nextInt(100);
		b = gerador.nextInt(100);
		System.out.println("Qual é a soma de " + a + " + " + b);
		soma = a + b;
		System.out.print("Digite sua resposta: ");
		resposta = teclado.nextInt();
		if(resposta == soma) {
			System.out.println("Resposta correta!");
		}else {
			System.out.println("Resposta Errada! A resposta correta é: " + soma);
		}
		
		a = gerador.nextInt(100);
		b = gerador.nextInt(100);
		System.out.println("Qual é a soma de " + a + " + " + b);
		soma = a + b;
		System.out.print("Digite sua resposta: ");
		resposta = teclado.nextInt();
		if(resposta == soma) {
			System.out.println("Resposta correta!");
		}else {
			System.out.println("Resposta Errada! A resposta correta é: " + soma);
		}
		
		a = gerador.nextInt(100);
		b = gerador.nextInt(100);
		System.out.println("Qual é a soma de " + a + " + " + b);
		soma = a + b;
		System.out.print("Digite sua resposta: ");
		resposta = teclado.nextInt();
		if(resposta == soma) {
			System.out.println("Resposta correta!");
		}else {
			System.out.println("Resposta Errada! A resposta correta é: " + soma);
		}
		
		a = gerador.nextInt(100);
		b = gerador.nextInt(100);
		System.out.println("Qual é a soma de " + a + " + " + b);
		soma = a + b;
		System.out.print("Digite sua resposta: ");
		resposta = teclado.nextInt();
		if(resposta == soma) {
			System.out.println("Resposta correta!");
		}else {
			System.out.println("Resposta Errada! A resposta correta é: " + soma);
		}
		
		teclado.close();
	}

}
