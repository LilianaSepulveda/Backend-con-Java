public class OrdenInverso {
    // Escribe un programa que recorra un array de enteros y los imprima en orden
    // inverso, comenzando desde el último elemento.
    // El tamaño y los números a contener pueden ser de tu elección.
    public static void main(String[] args) {
        System.out.println("\033\143");
        int[] array = { 20, 40, 5, 1 };

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("El elemento en la posición " + i + " es : " + array[i]);
        }
    }
}
