import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		System.out.println("Ingrese la temperatura que desee: ");
		int temperatura = sc.nextInt();
		
		do {
			System.out.println("¿Que conversion desea realizar? 1. Celsius a Farenheit  2. Farenheit a Celsius");
			opcion = sc.nextInt();
		} while(opcion<1 || opcion>2);   // El usuario debe elegir la opcion
		
		int conv;  

		// La dos opciones:
		switch(opcion) {
		case 1:
			conv = temperatura * 9 / 5 + 32;  // Pasaje de Celsius a Farenheit
			System.out.println("El resultado de la conversion da: " + conv + " Grados Farenheit");
			break;
		
		case 2: 
			conv = (temperatura - 32) * 5 / 9;  // Pasaje de Farenheit a Celsius
			System.out.println("El resultado de la conversion da: " + conv + " Grados Celsius");
			break;
		}
		
		sc.close();
	}

}
