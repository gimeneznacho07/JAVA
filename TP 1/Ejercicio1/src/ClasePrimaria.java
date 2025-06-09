
public class ClasePrimaria { // Declaro la clase

	public static void main(String[] args) { // Declaro el main
		for(int i=1; i<100; i++) {  // Hago el ciclo for para recorrer los 100 numeros
			if(i % 2 == 0) {  // Hago la condicion que dice que si el nro es par (da resto 0 al dividirlo por 2)
				System.out.println("Par");  // Imprime Par si se cumple la condicion
			}
			else {  // Si no se cumple la condicion
				System.out.println(i); // Se imprime el nro
			}
		}

	}
}