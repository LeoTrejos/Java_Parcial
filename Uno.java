import java.util.Scanner;
/* 1. Ejercicio de Verificación de Año Bisiesto:
Crea un programa en Java que solicite al usuario ingresar un año y determine si es un año
bisiesto o no. Un año bisiesto es aquel divisible por 4, excepto aquellos divisibles por 100
pero no por 400. Por ejemplo, 2000 y 2400 son años bisiestos, mientras que 1800, 1900
y 2100 no lo son.  */

public class Uno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa un nombre:");
        String Nombre = scanner.nextLine();
        System.out.print(Nombre + ", Por favor ingresa un año: ");
        int Año = scanner.nextInt();

        if ((Año % 4 == 0 && Año % 100 != 0) || Año % 400 == 0) {
            System.out.println(Nombre + ", el año es: " + Año + " es un año bisiesto.");
        } else {
            System.out.println(Nombre + ", el año es: " + Año + " no es un año bisiesto.");
        }
    }
}