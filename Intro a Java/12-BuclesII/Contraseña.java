/*Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while.
La contraseña correcta es "secreto". Continuará pidiéndote que ingreses la contraseña hasta que sea correcta.
*/
import java.util.Scanner;

public class Contraseña {
    
    public static void main(String[] args) {
    Scanner miScanner = new Scanner(System.in);
    String contra = "Contra";
    String contraIngresada;
    boolean flag = false;
    
    do {
    System.out.println("Ingresa la contraseña: ");
    contraIngresada = miScanner.nextLine();
    if(contra.equals(contraIngresada))
    {
    flag = true;
    }
    else
    {
    System.out.println("La contraseña es incorrecta.");
    flag = false;
    }
    } while (flag == false);
    System.out.println("Ingresaste al sistema");
    miScanner.close();   
    }
    
    }
