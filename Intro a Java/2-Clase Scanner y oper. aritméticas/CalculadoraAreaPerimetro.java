// Pide al usuario que ingrese el valor de la base y de la altura de un rectángulo.
// Almacena estos valores en variables previamente declaradas llamadas baseRectangulo y alturaRectangulo, respectivamente.
// Calcula y almacena el perímetro del rectángulo utilizando la fórmula: Perímetro = 2 × base + 2 × altura.
// Muestra el resultado del perímetro por consola junto con un mensaje adecuado.
// Calcula y almacena el área del rectángulo utilizando la fórmula: Área = base × altura.
// Muestra el resultado del área por consola junto con un mensaje adecuado.
import java.util.Scanner;

public class CalculadoraAreaPerimetro {
    public static void main(String[] args) {
        float baseRectangulo;
        float alturaRectangulo;
        float perimetroRectangulo;

        Scanner sc= new Scanner(System.in);
        System.out.println("\033\143");// para quitar en consola el texto relleno
        System.out.println("Ingresa en valor de la base del rectangulo");
        baseRectangulo = sc.nextFloat();
        System.out.println("Ingresa en valor de la altura del rectangulo");
        alturaRectangulo = sc.nextFloat();

        perimetroRectangulo = 2 * baseRectangulo + 2 * alturaRectangulo;
        System.out.println("El perímetro del rectángulo es: "+perimetroRectangulo);
        System.out.println("El perímetro del rectángulo es: "+(baseRectangulo*alturaRectangulo));
        
        sc.close();

    }
}
