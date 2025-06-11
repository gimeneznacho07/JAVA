import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Ingrese un numero entre 1 y 10: ");  // Le pido al usuario que ingrese un nro del 1 al 10
			num = sc.nextInt();
		} while(num<1 && num>10);  // Mientras que no cumpla la condicion (se lo pido hasta que la cumpla)
		
		System.out.println("La tabla de multiplicar del " + num + "es: ");   // Imprimo la tabla
		
		for(int i=0; i<=10; i++) {
			int result = num * i;   // Multiplico el nro ingresado por i
			System.out.println(num + " multiplicado por " + i + " es " + result);  // Imprimo cada numero de la tabla
		}
		
		sc.close();

	}

}
