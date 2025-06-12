import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un año: ");
		int año = sc.nextInt();
		boolean añoBisiesto = false;   
		
		if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {  // Si el año es divisible por 4, excepto 100, menos 400.
			añoBisiesto = true;   // El año es bisiesto
		} else {
			añoBisiesto = false;  // Si no cumple con la condicion anterior, no lo es
		}
		
		if(añoBisiesto) {
			System.out.println("El año " + año + " es bisiesto");
		} else {
			System.out.println("El año " + año + " no es bisiesto");
		}
		
		sc.close();
	}

}
