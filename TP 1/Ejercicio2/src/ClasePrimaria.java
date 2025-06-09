public class ClasePrimaria {

    public static void main(String[] args) {
        for (int i = 50; i <= 100; i++) {  // Ciclo for para recorrer los nros del 50 al 100
            boolean primo = true;  // Declaro primo como un booleano

            // Verifico si es primo
            if (i < 2) { 
                primo = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            // Si es primo, se imprime y se indica que es primo
            if (primo) {
                System.out.println(i + ": Primo");
            } 
            // Si no es primo, se imprime el nro y luego cada divisor
            else {
                System.out.print(i + ": ");
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " "); // Se imprimen todos los divisores en una misma línea
                    }
                }
                System.out.println(); // Salto de línea para mayor organizacion 
            }
        }
    }
}
