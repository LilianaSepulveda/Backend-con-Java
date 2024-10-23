
// Escribe un programa en el que declares una variable de tipo array 
//que contenga 10 elementos de tipo entero. Inicializa el arreglo con valores aleatorios entre 1 y 100, 
//imprime por consola el arreglo inicial y luego ordenalo en forma descendente utilizando el método Arrays.sort(). Finalmente, imprime los elementos ordenados en la consola.
import java.util.Arrays;

public class OrdenaDescendente{
    public static void main(String[] args) {

int[] arr = new int[10];
for (int i = 0; i < arr.length; i++) {
arr[i] = (int) (Math.random() * 100)+1;
}

System.out.println("El array original es: " + Arrays.toString(arr));
Arrays.sort(arr);

System.out.println("El array ordenado es: " + Arrays.toString(arr));

int[] arr2= new int[arr.length];
for (int i=0; i<arr.length; i++) {
arr2[i]= arr[arr.length-1-i];

}

System.out.println("El array ordenado descendente es: " + Arrays.toString(arr2));
}
}