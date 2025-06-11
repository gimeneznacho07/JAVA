import java.util.Scanner;

public class ClasePrimaria {
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);  // Creo el scanner para leer lo que ingresa el usuario
        int num; // Creo la variable donde se almacena el numero
        boolean cumpleCondicion = false;  // Creo la variable para ver si se cumple la condicion
        do{  // Le indico al programa que ejecute lo siguiente mientras que la condicion no se cumpla
		    System.out.println("Ingrese un numero: "); // Le pido al usuario que ingrese el nro
		    num = sc.nextInt();  // Guardo el nro ingresado
		    boolean primo = true;  
		    // Verifico si el nro es primo
		    if (num < 2) { 
                primo = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            // Si el nro cumple con la condicion se imprime el mensaje que lo indica, sino se imprime el mensaje que dice que no se cumple
            if (num>100 && primo){
                cumpleCondicion = true;
                System.out.println("El numero es mayor a 100 y es primo");
            } else{
                System.out.println("El numero no cumple con la condicion");
            }
        }
		while (!cumpleCondicion); // Para que se ejecute lo anterior, la condicion no se debe cumplir
		sc.close();  // Cierro el scanner
	}
}