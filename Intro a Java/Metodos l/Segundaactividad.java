import java.util.*;

public class Segundaactividad {
    /*
     * 1. Obtener datos: Perfeccionando la actividad de “imprimir datos”,
     * no solo crea el método imprimeNombreYEdad(String nombre, int edad) que reciba
     * dos parámetros,
     * el nombre y la edad, sino a su vez, crea dos métodos para obtener el nombre y
     * la edad, respectivamente.
     * Ambos métodos deben recibir por parámetro un objeto de tipo "Scanner".
     *
     */

    public static Scanner pepe = new Scanner(System.in);

    public static void main(String[] args) {
        imprimirNombreYEdad(pedirNombre(), pedirEdad());
        pepe.close();
    }

    private static void imprimirNombreYEdad(String nom, Integer edad) {
        System.out.println("Me llamo " + nom + " y tengo " + edad + " años.");
    }

    // private static void imprimirNombreYEdad(String nom, Integer edad, int num) {
    // System.out.println("Me llamo " + nom + " y tengo " + edad + " años.");
    // }

    private static String pedirNombre() {
        System.out.println("Ingrese su nombre");

        String nombre = pepe.nextLine();

        return nombre;

    }

    private static int pedirEdad() {
        System.out.println("Ingrese su edad");

        int edad = pepe.nextInt();

        return edad;

    }
}
