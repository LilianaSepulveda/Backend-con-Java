import java.util.Scanner;

public class BusquedaElemento {
public static void main(String[] args) {
int[] numeros = {4,7,9};
String buscador;
Scanner entradaTeclado = new Scanner(System.in);
System.out.print ("Ingresa el número a buscar: ");
int numeroABuscar = entradaTeclado.nextInt();
buscador = (numeroABuscar==numeros[0]) ? "El número "+numeroABuscar+" está en la posición 0"
: (numeroABuscar==numeros[1]) ? "El número "+numeroABuscar+" está en la posición 1"
: (numeroABuscar==numeros[2]) ? "El número "+numeroABuscar+" está en la posición 2"
: "El número "+numeroABuscar+" no se encuentra";
System.out.println (buscador);
entradaTeclado.close();
}
}
