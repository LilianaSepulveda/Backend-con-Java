/* Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:
1.Comprar producto.
2.Realizar devolución.
3.Ver mis pedidos.
4.Preguntas frecuentes.
5.Salir.
Luego, solicita al usuario que elija una opción del menú mostrado en pantalla. 
El menú debe seguir apareciendo hasta que el usuario elija la opción para salir del programa. 
En este ejercicio, no es necesario que las opciones del menú realicen acciones reales, 
simplemente muestra un mensaje que indique qué opción eligió el usuario. */

import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        String [] opciones = {"1.Comprar producto",
         "2.Realizar devolución",
         "3.Ver mis pedidos",
         "4.Preguntas frecuentes",
         "5.Salir"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione la opción:\n");

        int deseo = 0;
        while (deseo != 5){

            for(int i=0; i <opciones.length; i++){
                System.out.println(opciones[i]);

        }
        deseo = sc.nextInt();
        }
        sc.close();        
    }
}
