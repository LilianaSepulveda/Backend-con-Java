import java.util.Scanner;

public class UnidadesTemperatura {
    public static void main(String[] args) {
        // 1. Solicita al usuario ingresar una temperatura y una unidad de medida:
        // Celsius (C) o Fahrenheit (F).
        // 2. Convierte la temperatura a la otra unidad de medida y muestra el resultado
        // en pantalla.
        // 3. El programa debe manejar:
        // Si ingresa una unidad de medida inválida, mostrará un mensaje de error.
        // Si ingresa una temperatura no válida, mostrará un mensaje de error.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una temperatura");

        double temperatura = sc.nextDouble();
        System.out.println("\033\143");// para quitar en consola el texto relleno
        System.out.println("Ingresa una unidad de medida: Celsius (C) o Fahrenheit");
        System.out.println("1-Celsius");
        System.out.println("2-Fahrenheit");  

        double unidadMed = sc.nextDouble();

        if (unidadMed == 1) {

            double Fahrenheit = (temperatura * 9 / 5) + 32;
            System.out.println("Tu temperatura convertida a Fahrenheit es "+Fahrenheit);
            
        }else if (unidadMed == 2){
            double Celsius = (temperatura - 32) * 5 / 9;
            System.out.println("Tu temperatura convertida a Celsius es "+Celsius);
        }else {
            System.out.println("Engresa una temperatura válida");
        }
        sc.close();
        }
    }


