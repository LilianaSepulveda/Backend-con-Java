//1. Pide al usuario que ingrese dos números, y:

//A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado. 
//B. Verifica si el primer número ingresado  es distinto al segundo número ingresado .
// Muestra el resultado en consola.
//C. Verifica si el primer número ingresado  es divisible por 2 . 
//Muestra el resultado en consola.
import java.util.Scanner;

public class OperadoresComparacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\033\143");// para quitar en consola el texto relleno
        System.out.println("Ingresa un número entero");
        int num1 = sc.nextInt();
        System.out.println("Ingresa otro número entero");
        int num2 = sc.nextInt();

        System.out.println("El número " + num1 + " es mayor que " + num2 + "? = " + (num1 > num2 ? "true" : "False"));
        System.out
                .println("El número " + num1 + " es distinto que " + num2 + "? = " + (num1 != num2 ? "true" : "False"));
        System.out.println("El número " + num1 + " es divisible por 2? = " + (num1 % 2 == 0 ? "true" : "False"));
        // 2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes
        // validaciones:
        // A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
        // B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
        System.out.println("Ingresa un tercer número entero");
        int n3 = sc.nextInt();
        System.out.println("Ingresa un cuarto entero");
        int n4 = sc.nextInt();
        System.out.println("El número " + num1 + " es mayor que el numero " + num2 + " y el numero " + n3
                + " es mayor al " + n4 + "? = " + (num1 > num2 && n3 > n4 ? "true" : "False"));
        System.out.println("El número " + num1 + " es mayor que el numero " + num2 + " o el numero " + n3
                + " es mayor al " + n4 + "? = " + (num1 > num2 || n3 > n4 ? "true" : "False"));
        sc.close();
    }

}
