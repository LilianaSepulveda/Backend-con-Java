import java.util.Scanner;

public class MenuInteractivo3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean check = true;

        while (check) {
            System.out.println(
                    "Elige una de las opciones del menú: \n1 Comprar Producto \n2 Realizar Devolución \n3 Ver mis pedidos \n4 Preguntas Frecuentes \n5 Salir ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Compraste un producto");
                    break;
                case 2:
                    System.out.println("Realizaste una devolución");
                    break;
                case 3:
                    System.out.println("Este es tu pedido");
                    break;
                case 4:
                    System.out.println("Estas son las preguntas frecuentes");
                    break;
                case 5:
                    System.out.println("Adiós, vuelve pronto");
                    check = false;
                    break;

                default:
                    System.out.println("No ingresaste una opción válida");
                    break;
            }

        }
        leer.close();
    }

}
