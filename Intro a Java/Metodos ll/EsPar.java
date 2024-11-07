import java.util.Scanner;

public class EsPar {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = solicitarNumero();
        if (esPar(numero)) {
            System.out.println("El " + numero + " es par");
        } else {
            System.out.println("El " + numero + " es impar");
        }

    }

    private static int solicitarNumero() {
        Integer numero = null;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);

        return numero;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
