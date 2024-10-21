import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int[] array = {2,3,4};
    int sum = array[0]+array[1]+array[2];
    System.out.println("El arreglo es: ["+array[0]+","+array[1]+","+array[2]+"]");
    System.out.println("El resultado de la suma es: "+sum);
    myScanner.close();
    }
    }