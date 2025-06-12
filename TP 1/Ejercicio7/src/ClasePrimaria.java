import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena de texto: ");  // Le pido al usuario que ingrese una cadena de texto
		String cadena = sc.nextLine().toLowerCase();  // Paso toda la cadena a minuscula, asi no hay diferencias
		
		int vocales = 0;   // Contador de vocales (luego si detecta alguna, se incrementa)
		int consonantes = 0;  // Contador de consonantes
		
		// Recorro cada letra de la cadena
		for(int i=0; i<cadena.length(); i++) {   
			char letra = cadena.charAt(i);  
			
			// Si la letra es vocal
			if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
				vocales++;  // Se incrementa el contador
			} else {
				consonantes++;     // Si no es vocal, se incrementa el de consonantes
			}
		}
		
		// Se imprime la cantidad de vocales y consonantes
		System.out.println("La cantidad de vocales en su palabra: " + vocales);
		System.out.println("La cantidad de consonantes en su palabra: " + consonantes);

		sc.close();
	}

}
