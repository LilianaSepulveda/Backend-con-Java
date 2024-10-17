import java.util.Scanner;

public class SolicitaNombreEdad {
    public static void main(String[] args) {
// Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..
// Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..
// Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.
        Scanner sc = new Scanner(System.in);
        System.out.println("\033\143");// para quitar en consola el texto relleno
        System.out.println("Ingresa tu nombre: ");
        String name = sc.nextLine();
        System.out.println("welcome to the jungle "+name);

        System.out.println("Ingresa tu edad ");
        int age = sc.nextInt();
        System.out.println("Tu edad es "+age);

        System.out.println("Hello, tu nombre es "+name+" y tu edad es "+age);

sc.close();

}
}
