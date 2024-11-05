import java.util.Arrays;
import java.util.Scanner;
public class ManipulandoOraciones {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int opcion;
String[] alumnosNombres = new String[10];
double[] alumnosNotas = new double[10];
int indice = 0;
do {
System.out.println("Menú de opciones:");
System.out.println("1. Registrar alumno");
System.out.println("2. Mostrar todos los alumnos");
System.out.println("3. Mostrar promedio de notas");
System.out.println("4. Buscar alumno por nombre");
System.out.println("5. Modificar nota de alumno por nombre");
System.out.println("6. Eliminar alumno por nombre");
System.out.println("0. Salir");
System.out.print("Seleccione una opción: ");
opcion = sc.nextInt();

// Los casos
switch (opcion) {
case 1 -> {
// Registrar alumno: Permitir al usuario registrar un nuevo alumno ingresando su nombre y nota
System.out.println("Ingrese el nombre del alumno: ");
sc.nextLine(); // Limpiar el buffer de entrada
String nombreAlumno = sc.nextLine();
System.out.println("Ingrese la nota del alumno: ");
double notaAlumno = sc.nextDouble();

if (indice < alumnosNombres.length && indice < alumnosNotas.length) {
if (notaAlumno >= 0 && notaAlumno <= 10 && !nombreAlumno.isEmpty()) {
// Agregar el nuevo alumno al arreglo
alumnosNombres[indice] = nombreAlumno;
alumnosNotas[indice] = notaAlumno;
indice++;

String[] arrayCopiaAlumnos = Arrays.copyOf(alumnosNombres,alumnosNombres.length + 1);
arrayCopiaAlumnos[alumnosNombres.length] = nombreAlumno;
alumnosNombres = arrayCopiaAlumnos;

double [] arrayCopiaNotas = Arrays.copyOf(alumnosNotas,alumnosNotas.length + 1);
arrayCopiaNotas[alumnosNotas.length] = notaAlumno;
alumnosNotas = arrayCopiaNotas;
}
}else{
System.out.println("No hay espacio para registrar el nuevo alumno");
}
}
case 2 -> {
// Mostrar todos los alumnos: Mostrar en pantalla el nombre y la nota de todos los alumnos registrados hasta el momento.
if (indice > 0) {
for (int i = 0; i < indice; i++) {
System.out.println("Alumno: " + alumnosNombres[i] + " - Nota: " + alumnosNotas[i]);
}
}else{
System.out.println("No hay alumnos registrado");
}
}
case 3 -> {
// Mostrar promedio de notas: Calcular y mostrar en pantalla el promedio de las notas de todos los alumnos registrados hasta el momento.
if (indice > 0) {
//double promedio = 0;
double suma = 0;
for (int i = 0; i < indice; i++) {
suma += alumnosNotas[i];
}
// System.out.println("Promedio de notas: " + suma / alumnosNotas.length);
System.out.println("Promedio de notas: " + suma / indice);
}
}
case 4 -> {
// Buscar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y mostrar en pantalla su nota si el alumno existe.
System.out.println("Ingrese el nombre del alumno: ");
sc.nextLine(); // Limpiar el buffer de-turned
String nombreABuscar = sc.nextLine();

int i = 0;
boolean fueEncontrado = false;
while (!fueEncontrado && i < alumnosNombres.length) {
if (alumnosNombres[i].equalsIgnoreCase(nombreABuscar)) {
fueEncontrado = true;
// break;
}
i++;
}

if (fueEncontrado) {
System.out.println("La nota de " + nombreABuscar + " es: " + alumnosNotas[--i]);
// System.out.println("La nota de " + nombreABuscar + " es: " + alumnosNotas[i]); // Junto con
// Break
}else{
System.out.println("El alumno no existe");
}
}
case 5 -> {
// Modificar nota por nombre: Solicitar al usuario ingresar el nombre de un alumno y permitir modificar su nota si el alumno existe.
System.out.println("Ingrese el nombre del alumno: ");
sc.nextLine(); // Limpiar el buffer de-turned
String nombreAModificar = sc.nextLine();

int i = 0;
boolean fueEncontrado = false;
while (!fueEncontrado && i < alumnosNombres.length) {
if (alumnosNombres[i].equalsIgnoreCase(nombreAModificar)) {
fueEncontrado = true;
// break;
}
i++;
}

if (fueEncontrado) {
System.out.println("Ingrese la nueva nota: ");
double notaAModificar = sc.nextDouble();
if (notaAModificar >= 0 && notaAModificar <= 10) {
alumnosNotas[--i] = notaAModificar;
}else{
System.out.println("La nota no es valida");
}
}else{
System.out.println("El alumno no existe");
}
}
case 6 -> {
// Eliminar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y eliminar al alumno si existe.
System.out.println("Ingrese el nombre del alumno: ");
sc.nextLine(); // Limpiar el buffer de-turned
String nombreAEliminar = sc.nextLine();

int i = 0;
boolean fueEncontrado = false;
while (!fueEncontrado && i < alumnosNombres.length) {
if (alumnosNombres[i].equalsIgnoreCase(nombreAEliminar)) {
fueEncontrado = true;
// break;
}
i++;
}

if (fueEncontrado) {
String alumnosNombresCopia[] = new String[alumnosNombres.length - 1];
double alumnosNotasCopia[] = new double[alumnosNotas.length - 1];

for (int j = 0, k = 0; j < alumnosNombres.length; j++) {
if (j != --i) {
alumnosNombresCopia[k] = alumnosNombres[j];
alumnosNotasCopia[k] = alumnosNotas[j];
k++;
}
}
alumnosNombres = alumnosNombresCopia;
alumnosNotas = alumnosNotasCopia;

}else{
System.out.println("El alumno no existe");
}
}
case 0 -> {
System.out.println("Nos vemos!");
}
}
}while(opcion != 0);
}
}

