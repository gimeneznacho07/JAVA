import java.util.Scanner;

public class ClasePrimaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N;
		
		do {
			System.out.println("Ingrese un numero positivo: ");  // Le pido que ingrese un numero al usuario
			N = sc.nextInt();  // Leo ese numero y lo almaceno
		} while(N<=0);   // Mientras que el numero sea negativo
		
		int sumaPares = 0;
		int sumaImpares = 0;
		
		for(int i=0; i<=N; i++) {
			if(i % 2 == 0) {        
				sumaPares += i;     // Se suman los nros pares hasta N (el que ingreso el usuario)
			} else {                
				sumaImpares += i;   // Se suman los impares hasta N
			}
		}
		
		// Se imprimen los resultados
		System.out.println("La suma de numeros PARES ingresados es: " + sumaPares);   
		System.out.println("La suma de numeros IMPARES ingresados es: " + sumaImpares);
		
		sc.close();
	}

}
