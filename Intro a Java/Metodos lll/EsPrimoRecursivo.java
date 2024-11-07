import java.util.Scanner;

public class EsPrimoRecursivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        boolean esPrimo;

        do {
            System.out.println("Ingrese un número, y cero (0) para salir:");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Programa finalizado.");
                break;
            }
            esPrimo = esPrimo(numero, 2);

            if (esPrimo) {
                System.out.printf("\nEl número %d es primo!", numero);
            }

        } while (numero != 0 && !esPrimo);

        sc.close();

    }

    public static boolean esPrimo(int num, int i) {
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            if (num % i == 0) {
                return false;
            }

            if (i >= (int) Math.sqrt(num)) {
                return true;
            }
            return esPrimo(num, i + 1);
        }
    }
}
