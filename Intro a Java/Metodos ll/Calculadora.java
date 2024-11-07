import java.util.Scanner;

public class Calculadora {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        entrada.close();
    }

    public static void menu() {
        int opcion = 0;

        do {
            System.out.println("Calculadora----- ");

            System.out.print("Ingrese un número: ");
            float num1 = entrada.nextFloat();

            System.out.print("Ingrese otro número: ");
            float num2 = entrada.nextFloat();

            System.out.print("1 - suma\n"
                    + "2 - resta\n"
                    + "3 - multiplicación\n"
                    + "4 - división\n"
                    // + "salir\n"
                    + "Ingresa el número de opción del cálculo que quieras realizar: ");

            opcion = entrada.nextInt();

            if (opcion != 5) {
                calcularOperaciones(opcion, num1, num2);
            }
        } while (opcion != 5);
    }

    public static void calcularOperaciones(int opcion, float num1, float num2) {
        float resultado;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Suma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resta: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Multiplicación: " + resultado);
                break;
            case 4:
                System.out.println("División: " + ((num2 == 0) ? "error matemático" : (num1 / num2)));
                break;
            default:
                System.out.println("Opción no válida. Saliendo... \n");
                break;
        }
    }
}
