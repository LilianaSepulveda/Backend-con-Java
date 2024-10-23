//Escribe un programa que genere un array de 10 elementos de tipo entero. 
//Inicializa cada elemento con un número aleatorio menor a 100 y luego imprime todos los elementos del array 
//en una única línea. Posteriormente, 
//recorre el array para contar los elementos pares y muestra el total en la consola.
public class ContarElementosPares {
    public static void main(String[] args) {
        int[] array = new int[10];
        int pares = 0;
        
        System.out.println("\033\143");
        for (int elem : array) {
            elem = (int)(Math.random()*100);
            System.out.print(" "+elem);
            if (elem % 2 == 0){
                pares++;
            }
            
        }
        System.out.println("\n Los pares encontrados en el array son: "+pares);
    }
}
