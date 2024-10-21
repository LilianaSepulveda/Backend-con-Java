
// El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, solicita un número al usuario 
//y muestra por consola si ese número está presente en el array o no. Es importante utilizar únicamente 
//las herramientas aprendidas hasta el momento, sin emplear bucles en el proceso.
import java.util.Scanner;

public class BuscarElemento {
    public static void main(String[] args) {
        int[] number = { 4, 7, 9 };

        Scanner sc = new Scanner(System.in);
        System.out.println("\033\143");// para quitar en consola el texto relleno
        System.out.println("Ingresa un número para buscar: ");

        int looking = sc.nextInt();
        boolean existe = false;
        if (number[0] == looking) {
            existe = true;
        }
        if (number[1] == looking) {
            existe = true;
        }
        if (number[2] == looking) {
            existe = true;
        }
        if (existe) {
            System.out.println("El número " + looking + " buscado existe en el array");
        }

        sc.close();
    }

}
