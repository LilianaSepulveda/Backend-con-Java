// //Declara dos variables, y asígnales un valor a cada una de ellas.

// Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. 
//Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, 
//Ej: La suma de las 2 variables es : “[resultado]”;

// Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente declaradas, 
//realiza la suma de los números y muestra el resultado en la consola.
public class OperacionesBasica {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;

        System.out.println("\033\143");// para quitar en consola el texto relleno
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));

        
        System.out.println("a / b = "+(3d / 7d));//forzar tipo de dato double con decimales
        
        System.out.println("a % b = "+(double)(a % b));
        System.out.println("a % b = "+(3f % 7f));//forzar tipo de dato float
        



    }
}
