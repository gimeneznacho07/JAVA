public class ClasePrimaria {

    public static void main(String[] args) {
        for (int i = 50; i <= 100; i++) {
            boolean primo = true;

            // Verificamos si es primo
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

            // Si es primo, lo indicamos
            if (primo) {
                System.out.println(i + ": Primo");
            } else {
                System.out.print(i + ": "); // Imprimimos el número
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " "); // Todos los divisores en una misma línea
                    }
                }
                System.out.println(); // Salto de línea al final
            }
        }
    }
}

