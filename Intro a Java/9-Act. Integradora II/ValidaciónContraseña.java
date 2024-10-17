// Escribe un programa que solicite al usuario que ingrese una contraseña y verifique si cumple con los siguientes criterios para considerarse segura:
// La contraseña debe tener al menos 8 caracteres.
// La contraseña debe contener al menos una letra mayúscula y una letra minúscula.
// La contraseña debe contener al menos un número.
// La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).
// El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los criterios establecidos. Puedes utilizar métodos de la clase String para verificar cada uno de los criterios.

import java.util.Scanner;

public class ValidaciónContraseña {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String clave;
    boolean flag = true; // Bandera que indica si la clave es segura, la iniciamos en true suponiendo que estara segura desde el principio
    System.out.println("\033\143");// para quitar en consola el texto relleno
    System.out.print("Ingrese una clave: ");
    // clave = sc.next();
    clave = sc.nextLine();
    
    boolean tieneMinuscula = clave.matches(".*[a-z].*");
    boolean tieneMayuscula = clave.matches(".*[A-Z].*");
    boolean tieneNum = clave.matches(".*[0-9].*");
    boolean tieneCaracter = clave.matches(".*[^a-zA-Z0-9].*");
    
    // En caso de no cumplir con las condiciones, cambiamos el valor de la "flag" para que no muestre el mensaje de clave segura
    if (clave.length() < 8) {
    System.out.println("La clave debe tener al menos 8 caracteres.");
    flag = false;
    }
    if (!tieneMinuscula) {
    System.out.println("La clave debe contener al menos una letra minúscula.");
    flag = false;
    }
    if (!tieneMayuscula) {
    System.out.println("La clave debe contener al menos una letra mayúscula.");
    flag = false;
    }
    if (!tieneNum) {
    System.out.println("La clave debe contener al menos un número.");
    flag = false;
    }
    if (!tieneCaracter) {
    System.out.println("La clave debe contener al menos un carácter especial.");
    flag = false;
    }
    
    // Bandera que indica si la clave es segura
    if (flag) {
    System.out.println("La clave es segura.");
    }
    
    sc.close();
    }//Opcional: hacer sin regex y sin bucles
  
}