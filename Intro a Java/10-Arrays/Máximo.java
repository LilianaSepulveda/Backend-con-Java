// Escribe un programa en el cual se cree una variable de tipo array
// que contenga cinco elementos de tipo entero, ingresados por el
// usuario. El programa debe buscar el máximo e imprimir por consola
// el resultado utilizando solamente las herramientas adquiridas hasta el momento.

import java.util.Scanner;

public class Máximo {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
int[] array = new int[5];
System.out.print("Ingresa el primer valor del array, por favor,");
array[0] = leer.nextInt();

System.out.print("Ingresa el segundo valor del array, por favor,");
array[1] = leer.nextInt();

System.out.print("Ingresa el tercero valor del array, por favor,");
array[2] = leer.nextInt();

System.out.print("Ingresa el cuarto valor del array, por favor,");
array[3] = leer.nextInt();

System.out.print("Ingresa el quinto valor del array, por favor");
array[4] = leer.nextInt();

System.out.println(
"El array tiene estos valores: [" + array[0] + "," + array[1] + "," + array[2] + "," + array[3] + ","
+ array[4] + "]");

int maximo = array[0] > array[1] ? array[0] : array[1];
maximo = maximo > array[2] ? maximo : array[2];
maximo = maximo > array[3] ? maximo : array[3];
maximo = maximo > array[4] ? maximo : array[4];

System.out.println("El valor máximo del array es: " + maximo);

leer.close();
}
}