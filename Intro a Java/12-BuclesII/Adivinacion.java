import java.util.Scanner;

public class Adivinacion {
    public static void main(String[] args) {

        System.out.println("\033\143");
        int numeroMisterioso = (int) ((Math.random() * 21) + 1); // Math.random()*(superior-inferior +1)+inferior)
        System.out.println("El número misterioso es " + numeroMisterioso);
        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.println("Por favor ingresa un número para adivinar el número misterioso");
            num = scan.nextInt();
            if (num > numeroMisterioso) {
                System.out.println("Su número es más grande que el número misterioso");
            }
            if (num < numeroMisterioso){
                System.out.println("El número es más pequeño que el número misterioso");
            }          
        } while (num != numeroMisterioso);

        System.out.println("El número es el misterioso");
        scan.close();
    }
}
