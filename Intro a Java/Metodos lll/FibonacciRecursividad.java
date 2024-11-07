import java.util.Scanner;

public class FibonacciRecursividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posición en la serie de Fibonacci:");
        int pos = sc.nextInt();
        System.out.println(FibonacciRecursivo(pos));
        sc.close();
    }

    public static Integer FibonacciRecursivo(int pos) {
        if (pos <= 1) {
            return pos;
        } else {
            return FibonacciRecursivo(pos - 1) + FibonacciRecursivo(pos - 2);
        }
    }

}
