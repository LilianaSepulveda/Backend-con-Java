// En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número 
// (incluida la lógica en un método llamado pedirNumero())  y luego imprime la tabla de multiplicar 
// de ese número del 1 al 10 (incluida la lógica en un método llamado imprimirTablaMultiplicar()). 
// Para ello, implementarás un método que reciba el número ingresado por el usuario y que imprima la 
// tabla de multiplicar correspondiente.

import java.util.Scanner;

public class Tablamultiplicar {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = pedirNumero();
        tablaMultiplicar(num);
        sc.close();
    }

    private static int pedirNumero() {
        System.out.println("Ingresa un número");

        return sc.nextInt();
    }

    private static void tablaMultiplicar(int multi) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * multi);

        }
    }

}
