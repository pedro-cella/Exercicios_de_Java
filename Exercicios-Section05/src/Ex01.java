
public class Ex01 {

	public static void main(String[] args) {  
	    int contador = 0;
	    int numero = 0;
	    while(contador != 5) {
	    	numero++;
	    	if(numero % 3 == 0) {
	    		System.out.println( numero + " é múltiplo de 3");
	    		contador++;
	    	}
	    }
	}  

}
