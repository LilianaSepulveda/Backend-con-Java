        import java.lang.reflect.Array;
        import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;
        
        public class GenerarContraseñas {
        
        public static void main(String[] args) {
        //pedir longitud
        int longitudPassword;
        System.out.println("Ingrese un largo para la contraseña: ");
        Scanner sc = new Scanner(System.in);
        longitudPassword = sc.nextInt();
        sc.close();
        
        
        //llamar metodo contraseña aleatoria
        generarContraseña(longitudPassword);
        //imprimir contraseña
        
        }
        //crear contraseña aleatoria
        //al menos una letra mayúscula
        // una letra minúscula
        // un dígito
        private static String[] generarContraseña(int longitudPassword) {
        // Se crea array a llenar
        String[] arr = new String[longitudPassword];
        //ciclo para llenar el array
        for(int i=0; i<longitudPassword; i++){
        Random random = new Random();
        Character digit = (char) ('A' + random.nextInt(25));
        String stringDigit = Character.toString(digit); // Correct way to convert int to String
        arr[i] = stringDigit;
        System.out.println(Arrays.toString(arr));
        }
        // String[] password= new String[arr.length];
        // //convertir el array a String
        // for(int i=0; i< arr.length; i++){
        // password[i] = Character.toString(arr[i]);
        // }
        
        // Imprimir String
        return arr;
        }
        
        
        
        }
        
        // ✏️ Actividad: Generando contraseñas
        // Vas a desarrollar un programa en Java que genere una contraseña aleatoria. Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos. La contraseña será almacenada en un arreglo de caracteres.
        
        // Para generar la contraseña, utilizarás un bucle for que repetirá la operación tantas veces como la longitud de la contraseña especificada por el usuario.
        
        // Para asegurarte de que la contraseña generada contenga al menos una letra mayúscula, una letra minúscula y un dígito, usaré bucles do-while y while junto con los métodos isUpperCase, isLowerCase e isDigit de la clase Character.
        
        // Finalmente, convertirás el arreglo de caracteres en un String con un bucle for y luego imprimirás la contraseña generada en la consola. 
    }
    

