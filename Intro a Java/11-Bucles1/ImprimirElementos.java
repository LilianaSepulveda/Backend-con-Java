//Escribe un programa que recorra un array de enteros y muestre cada elemento en una línea separada. 
//El tamaño, tipo de datos y la información a contener pueden ser de tu elección.
public class ImprimirElementos {
    public static void main(String[] args) {
        int[] array = { 5, 6, 7, 8, 9 };

        System.out.println("\033\143");

        for (int i = 0; i < array.length; i++) {
            
            System.out.println("elemnto en la posicion "+i+" = "+array[i]);
        }
    }
    
}
