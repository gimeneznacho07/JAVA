import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// El usuario ingresa los tres nros pedidos
		System.out.println("Ingrese el primero numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		int num2 = sc.nextInt();
		
		System.out.println("Ingrese el tercer numero: ");
		int num3 = sc.nextInt();
		
		int nroMayor;
		
		if(num1>=num2 && num1>=num3) {   // Comparo si el nro 1 es mayor a los otros (pongo mayor o igual porque si hay dos nros iguales, saldra que el mayor es el distinto)
			nroMayor = num1;
		}
		else if(num2>=num1 && num2>=num3) {  // Comparo si el nro 2 es mayor a los otros
			nroMayor = num2;
		}
		else {      // Si ni el nro 1 y 2 son los mayores, entonces es el 3ro
			nroMayor = num3;
		}
		System.out.println("El numero mayor de los tres ingresados es: " + nroMayor);  // Imprimo el mayor
		
		sc.close();
	}

}
