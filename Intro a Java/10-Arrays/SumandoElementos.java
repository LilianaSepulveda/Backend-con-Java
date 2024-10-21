import java.util.Scanner;

public class SumandoElementos {
    // Escribe un programa en el cual se cree una variable de tipo array que contenga tres elementos de tipo entero. 
    //El programa debe sumar los tres elementos de forma manual e imprimir por consola el resultado utilizando solamente  
    //las herramientas adquiridas hasta el momento.
public static void main(String[] args) {
    int[] array1 = new int[3];
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\033\143");// para quitar en consola el texto relleno
    System.out.println("Ingresa primer número para conformar el array");

    array1[0] = sc.nextInt();
    System.out.println("Ingresa segundo número para conformar el array");

    array1[1] = sc.nextInt();
    System.out.println("Ingresa tercer número para conformar el array");

    array1[2] = sc.nextInt();
    System.out.println("El array está conformado por "+array1[0]+","+array1[1]+","+array1[2]);
    System.out.println("El Resultado de la suma es: "+(array1[0]+array1[1]+array1[2]));
    sc.close();
}


}

