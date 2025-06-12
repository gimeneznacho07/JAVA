import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
		System.out.println("Ingrese un numero natural: ");   // Ingrese un numero
		num = sc.nextInt();
		} while(num<0);   // Mientras que el numero sea negativo
		
		int factorial = 1;
		for(int i=1; i<=num; i++) {
			factorial = factorial * i;   
		}
		
		System.out.println("El factorial de " + num + " es " + factorial);
		
		sc.close();
	}

}
