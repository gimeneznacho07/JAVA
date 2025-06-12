import java.util.Scanner;
import java.util.Random;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();   // Genero un numero aleatorio
		
		int numRandom = random.nextInt(101);   // El numero debe ser uno entre 0 y 100
		int intento;
		int cantidadIntentos = 0;  // Contador de los intentos
		
		System.out.println("Adivina el numero");
		
		do {
			System.out.println("Ingrese un numero: ");
			intento = sc.nextInt();
			cantidadIntentos++;   // Cada vez que erra de numero, se suma un intento
			
			if(intento > numRandom) {   // Si el numero es mayor, le doy la pista
				System.out.println("El numero es menor que el que ingreso");
			} else if(intento == numRandom) {  // Si adivino, se lo indico junto al nro de intentos
				System.out.println("Adivinaste, el numero es " + numRandom + " y la cantidad de intentos fue de " + cantidadIntentos);
			} else {
				System.out.println("El numero es mayor que el que ingreso");  // Si es menor, le doy la pista
			}
		} while(intento != numRandom);  // Mientras que no adivine, se siguen dando las pistas

			sc.close();
	}

}
