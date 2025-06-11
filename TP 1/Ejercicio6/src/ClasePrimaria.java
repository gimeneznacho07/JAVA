import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra: ");   // Le pido al usuario que ingrese una palabra o frase
		String palabra = sc.nextLine();
		String palabraInvertida = "";
		
		for(int i=palabra.length() - 1; i>=0; i--) {
			palabraInvertida += palabra.charAt(i);
		}
		
		System.out.println("La palabra invertida es: " + palabraInvertida);
		
		sc.close();
	}

}
