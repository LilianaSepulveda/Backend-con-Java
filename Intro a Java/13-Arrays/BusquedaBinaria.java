import java.util.Scanner;
import java.util.Arrays;

public class BusquedaBinaria {
public static void main(String[] args) {
int[] arr = new int[5];
for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random()*40+1);
System.out.println("El arreglo original es" + Arrays.toString(arr));
System.out.println("Ingrese un número entero");

Scanner scanner = new Scanner(System.in);
int numBuscado = scanner.nextInt();

Arrays.sort(arr);
System.out.println("Arreglo ordenado" + Arrays.toString(arr));
int index = Arrays.binarySearch(arr, numBuscado);

if (index < 0){
System.out.println("El número buscado no se encuentra en el arreglo.");
} else {
System.out.println("El número buscado tiene índice " + index);
}
scanner.close();
}
} 
