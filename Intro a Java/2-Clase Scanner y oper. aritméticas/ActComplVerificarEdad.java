
// Pide al usuario que ingrese su año de nacimiento y almacena el dato en una variable previamente declarada llamada añoNacimiento.
// Declara una variable del tipo Constante llamado ANIOACTUAL con el año actual.
// Calcula la edad actual del usuario, considerando que la cuenta sería ANIOACTUAL - añoNacimiento. Almacena el dato en una variable llamada calculoEdad.
// Determina si el usuario es mayor de edad (tener 18 años o más) y muestra un mensaje apropiado.
import java.util.Scanner;

public class ActComplVerificarEdad {
    public static void main(String[] args) {

        int añoNacimiento;
        int ANIOACTUAL = 2024;
        int calculoEdad;
        Scanner sc = new Scanner(System.in);

        System.out.println("\033\143");// para quitar en consola el texto relleno
        System.out.println("Ingresa tu año de nacimiento");
        añoNacimiento = sc.nextInt();
        calculoEdad = ANIOACTUAL - añoNacimiento;
        System.out.println("El usuario es mayor de edad? = " + (calculoEdad >= 18 ? "Si" : "No es mayor de edad"));
        sc.close();
    }
}
