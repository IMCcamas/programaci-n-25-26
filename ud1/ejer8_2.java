package promeblas1;
import java.util.Scanner;
public class ejer8_2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	 // Declaramos las variables necesarias
    int edad;                 // Guardará la edad actual introducida
    int sumaEdades = 0;       // Suma total de todas las edades
    int contador = 0;         // Contará cuántas edades se han introducido
    int mayoresEdad = 0;      // Contará cuántos alumnos son mayores de edad (18 o más)

    // Bucle para leer edades hasta que se introduzca una negativa
    do {
        System.out.print("Introduce la edad del alumno (negativa para terminar): ");
        edad = sc.nextInt(); // Leemos la edad

        if (edad >= 0) { // Solo procesamos edades no negativas
            sumaEdades += edad; // Sumamos la edad al total
            contador++;          // Incrementamos el número de alumnos introducidos

            if (edad >= 18) {   // Comprobamos si el alumno es mayor de edad
                mayoresEdad++;  // Aumentamos el contador de mayores de edad
            }
        }

    } while (edad >= 0); // El bucle se repite mientras la edad no sea negativa

    // Al salir del bucle, comprobamos si se introdujeron datos
    if (contador > 0) {
        // Calculamos la media de las edades
        double media = (double) sumaEdades / contador;

        // Mostramos los resultados
        System.out.println("\n----- RESULTADOS -----");
        System.out.println("Número de alumnos: " + contador);
        System.out.println("Suma de las edades: " + sumaEdades);
        System.out.printf("Media de las edades: %.2f%n", media);
        System.out.println("Alumnos mayores de edad: " + mayoresEdad);
    } else {
        // Si no se introdujo ninguna edad válida
        System.out.println("No se introdujeron edades válidas.");
    }

    // Cerramos el Scanner
    sc.close();
}
}
