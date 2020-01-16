
public class Ex48 {

	public static void main(String[] args) {
		 int F = 0;     // atual
	     int ant = 0;   // anterior
	     int soma = 0, i = 0;
	  
	     while(F < 4000000) { 
				if (i == 1) {
					F = 1;
		            ant = 0;
		        } else {
		        	if(F % 2 == 0) {
		        		soma += F;
		        	}
		        	F += ant;
		            ant = F - ant;
		        }
				
				i++;
			}
	     
	     System.out.println("Soma = " + soma);
	}

}
