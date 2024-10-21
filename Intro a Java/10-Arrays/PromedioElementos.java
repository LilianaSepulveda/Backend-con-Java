import java.util.Scanner;

public class PromedioElementos {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[4];
    int suma;
    float promedio;
    
    System.out.println("\033\143");
    System.out.println("Ingrese el primer elemento:");
    array[0] = scanner.nextInt();
    System.out.println("Ingrese el segundo elemento:");
    array[1] = scanner.nextInt();
    System.out.println("Ingrese el tercero elemento:");
    array[2] = scanner.nextInt();
    System.out.println("Ingrese el cuarto elemento:");
    array[3] = scanner.nextInt();
    
    suma= array[0]+array[1]+array[2]+array[3];
    promedio=(float)suma/(array.length);
    
    System.out.println("La suma de los elementos del array son: "+suma+" y su promedio es: "+promedio);

    //System.out.println("La suma de los elementos del array son: "+(array[0]+array[1]+array[2]+array[3])+"y su promedio es: "+((float)(array[0]+array[1]+array[2]+array[3])/(array.length)));
    
    scanner.close();
   
    }
    }