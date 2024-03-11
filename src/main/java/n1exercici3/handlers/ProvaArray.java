package n1exercici3.handlers;

public class ProvaArray {

	public String afegirNumeros(int numero, int posicio) {
		
		int[] numeros = new int[5];
		
		String message = "";
		
		try {
			numeros[posicio] = numero;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			message = e.toString();
		}
		
		return message;
	}	
}
