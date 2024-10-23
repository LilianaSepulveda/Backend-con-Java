public public class ActCompleInvertirArray {

    public static void main(String[] args) {
    /*
    * Invertir un array
    *
    * Escribe un programa que recorra un array de enteros y lo invierta, es decir,
    * que el primer elemento se convierta en el último y viceversa, luego imprime
    * el array resultante por consola. El tamaño y los números a contener pueden
    * ser de tu elección.
    *
    * IMPORTANTE: Debes invertir de forma permanente el orden de los elementos.
    * Analiza si necesitas hacer uso de elementos auxiliares para concluir el
    * ejercicio.
    */
    
    System.out.println("\033\143");
    int[] array = { 20, 40, 5, 1, 10, 50 }; // 0 1 2 3 0 < - > 3 1 lenght - 1 - i
    int aux;
    for (int i = 0; i <= ((array.length -1 ) / 2); i++) {
    aux = array[i];
    array[i] = array[array.length - 1 - i];
    array[array.length - 1 - i] = aux;
    }
    for (int i = 0; i < array.length; i++) {
    System.out.println("El elemento en la posición " + i + " es : " + array[i]);
    }
    }
    } 
    

