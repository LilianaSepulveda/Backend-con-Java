public class EncontrarValorMinimo {
    public static void main(String[] args) {
        System.out.println("\033\143");
        int[] array = {20, 40, 5, 1};
        int minimo = array[0];
        
        for (int i = 1; i < array.length; i++) {
        if (minimo > array[i]) {
        minimo = array[i];
        }
    }
    
System.out.println("El valor mínimo en el array es: " + minimo);
}
}


