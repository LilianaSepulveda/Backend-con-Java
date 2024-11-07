import java.util.Scanner;

public class TablaMultiplicarV2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[3];
        pedirNumero(numeros);

        tablaMultiplicar(numeros);
        sc.close();
    }

    private static void pedirNumero(int[] numeros) {
        System.out.println("Ingrese 3 números");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
    }

    private static void tablaMultiplicar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("-------");
            for (int j = 1; j <= 10; j++) {
                System.out.println(numeros[i] * j);
            }
        }
    }

}
