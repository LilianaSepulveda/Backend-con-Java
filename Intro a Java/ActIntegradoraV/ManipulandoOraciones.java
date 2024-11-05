import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.util.Collections;


public class ManipulandoOraciones {
       public static void main(String[] args) {

              Scanner miScanner = new Scanner(System.in);
              int opcion = 0;
              String oracion = "hola mundo";
              String[] arr;
              
              do {

                     // String clear = "\033\143"; // lineas para limpiar la ventana de comandos
                     // System.out.print(clear);

                     System.out.println(oracion);

                     System.out.println(" --- MENU PRINCIPAL ---");

                     System.out.println("1-Crear oración o Borrar oración");
                     System.out.println("2-Cantidad de caracteres de la oración");
                     System.out.println("3-Cantidad de palabras de la oración");
                     System.out.println("4-Mostrar palabras ordenadas alfabéticamente");
                     System.out.println("5-Ingresar un número y devolver la palabra correspondiente");
                     System.out.println("6-Buscar palabra dentro de la oración");
                     System.out.println("7-Modificar palabra dentro de la oración");
                     System.out.println("8-Agregar contenido a la oración");
                     System.out.println("9-Salir");
                     System.out.print("Por favor ingrese un numero: ");
                     opcion = miScanner.nextInt();

                     miScanner.nextLine();
                     arr = oracion.toUpperCase().split(" ");
                     int index=-1;

                     switch (opcion) {
                            case 1:
                                   if (oracion.isEmpty()) {
                                          System.out.println("Crear oracion");
                                          System.out.print("Por favor ingrese una oracion: ");
                                          oracion = miScanner.nextLine();

                                   } else {
                                          oracion = "";
                                          System.out.println("La oracion creada fue borrada exitosamente :)");
                                   }

                                   break;
                            case 2:
                                   System.out.println(
                                                 "La cantidad de caracteres de la oracion es: " + oracion.length());
                                   break;
                            case 3:

                                   System.out.println("La cantidad de palabras de la oracion es: "
                                                 + oracion.split(" ").length);
                                   break;
                            case 4:

                                   String[] arrOrd = arr.clone();
                                   Arrays.sort(arrOrd);
                                   System.out.println("Lista ordenada alfabeticamente: " + Arrays.toString(arrOrd));
                                   break;
                            case 5:
                            int pos =-1;
                                   do {
                                          System.out.print(
                                                        "Por favor ingrese un numero para saber la palabra de esa posicion: ");
                                           pos = miScanner.nextInt();
                                          miScanner.nextLine();
                                          if (pos > arr.length || pos < 0) {
                                                 System.out.println("El numero ingresado no existe");
                                                 
                                          } 

                                   } while (pos > arr.length || pos < 0);
                                   System.out.println("La palabra es: " + arr[pos-1]);

                                   break;
                                   case 6:
                                   System.out.println("Por favor ingrese la palabra a buscar:");
                                   String word = miScanner.nextLine();
                                   word=word.toUpperCase();
                                    index = Arrays.binarySearch(arr, word);
                                   if(index>=0){
                                          System.out.println("La palabra fue encontrada en la posicion: " + index);

                                   }else{
                                          System.out.println("La palabra no fue encontrada :(");
                                   }
                                   
                                   break;
                                   case 7:
                                   index=-1;

                                   do{
                                          System.out.print("Por favor ingrese una palabra a reemplazar:");
                                          String oldWord= miScanner.nextLine();
                                          oldWord=oldWord.toUpperCase();
                                          index = Arrays.binarySearch(arr, oldWord);//encontro la palabra?
                                          if(index>=0){ //si
                                                 System.out.println("La palabra fue encontrada en la posicion: " + index);
                                                 System.out.print("Ingrese la nueva palabra o frase:");
                                                 String newWord= miScanner.nextLine();//guardo la nueva palabra

                                                 
                                                 
                                                 arr[index] = newWord;//hola, a todos
                                                 oracion=Arrays.toString(arr);//reemplazar por una concatenacion dividad por espacios
                                                 arr = oracion.toUpperCase().split(" ");
                                                 System.out.println("mostrando el nuevo arreglo: " + Arrays.toString(arr));



                                                
       
                                          }else{
                                                 System.out.println("no se encontro la palabra");
                                          }


                                   }while(index<0);
                                   System.out.println(oracion);

                                   
                                   break;
                                   

                            default:
                                   System.out.println("opcion invalida! intente de nuevo...");
                                   break;
                     }

              } while (opcion != 9);

       }
}

