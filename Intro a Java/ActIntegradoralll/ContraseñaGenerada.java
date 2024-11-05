import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Collections;


public class ContraseñaGenerada {
public static void main(String[] args) {

Scanner miScaner = new Scanner(System.in);

System.out.print("Ingrese el tamaño de la contraseña:");
int size = miScaner.nextInt();

System.out.println("---------------------");
boolean mayusFlag ;
boolean minusFlag ;
boolean digitFlag ;

char[] password = new char[size];
do{
mayusFlag = false;
minusFlag = false;
digitFlag = false;
for(int i = 0;i<password.length;i++){
password[i] = (char) (Math.random() * (122 - 48) +48);
System.out.println(password[i]);

if(Character.isUpperCase(password[i])){
mayusFlag=true;
}
if(Character.isLowerCase(password[i])){
minusFlag=true;
}
if(Character.isDigit(password[i])){
digitFlag=true;
}

}
}while(!mayusFlag || !minusFlag || !digitFlag);

String resultado = new String(password);
System.out.println("Listo! La clave es:" +resultado);



}
}
