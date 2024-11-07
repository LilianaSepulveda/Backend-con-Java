import java.util.Scanner;

public class FactorialRecursividad {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa un numero");
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
